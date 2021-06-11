package dk.cphbusiness.mrv.twitterclone.impl;

import dk.cphbusiness.mrv.twitterclone.contract.UserManagement;
import dk.cphbusiness.mrv.twitterclone.dto.UserCreation;
import dk.cphbusiness.mrv.twitterclone.dto.UserOverview;
import dk.cphbusiness.mrv.twitterclone.dto.UserUpdate;
import dk.cphbusiness.mrv.twitterclone.util.Time;
import org.testcontainers.shaded.org.apache.commons.lang.ObjectUtils;
import redis.clients.jedis.Jedis;

import java.util.*;

public class UserManagementImpl implements UserManagement {

    private Jedis jedis;

    public UserManagementImpl(Jedis jedis) {
        this.jedis = jedis;
    }

    @Override
    public boolean createUser(UserCreation userCreation) {

        if (jedis.exists("user:" + userCreation.username)) return false;

        jedis.hmset("user:" + userCreation.username, Map.of(
                "username", userCreation.username,
                "firstname", userCreation.firstname,
                "lastname", userCreation.lastname,
                "passwordHash", userCreation.passwordHash,
                "birthday", userCreation.birthday,
                "numFollowers", "0",
                "numFollowing", "0"
        ));

        return true;
    }

    @Override
    public UserOverview getUserOverview(String username) {

        Map<String, String> test = jedis.hgetAll("user:" + username);

        if (!test.isEmpty()) {
            return new UserOverview(
                    username,
                    test.get("firstname"),
                    test.get("lastname"),
                    Integer.parseInt(test.get("numFollowers")),
                    Integer.parseInt(test.get("numFollowing"))
            );

        }
        return null;
    }

    @Override
    public boolean updateUser(UserUpdate userUpdate) {

        if (jedis.exists("user:" + userUpdate.username)) {

            Map<String, String> test = jedis.hgetAll("user:" + userUpdate.username);

            String firstname = test.get("firstname");
            String lastname = test.get("lastname");
            String birthday = test.get("birthday");


            if (userUpdate.firstname != null) firstname = userUpdate.firstname;

            if (userUpdate.lastname != null) lastname = userUpdate.lastname;

            if (userUpdate.birthday != null) birthday = userUpdate.birthday;


            jedis.hmset("user:" + userUpdate.username, Map.of(
                    "firstname", firstname,
                    "lastname", lastname,
                    "birthday", birthday
            ));

            return true;
        }
        return false;
    }

    @Override
    public boolean followUser(String username, String usernameToFollow) {

        if (!jedis.exists("user:" + username)) return false;
        if (!jedis.exists("user:" + usernameToFollow)) return false;

        try (var tran = jedis.multi()) {
            //Add the specified members to the set stored at key.
            tran.sadd(username + ":following", usernameToFollow);
            tran.hincrBy("user:" + username, "numFollowing", 1);
            tran.sadd(usernameToFollow + ":followed", username);
            tran.hincrBy("user:" + usernameToFollow, "numFollowers", 1);
            tran.exec();
        }

        return true;
    }

    @Override
    public boolean unfollowUser(String username, String usernameToUnfollow) {

        if (!jedis.exists("user:" + username)) return false;

        try (var tran = jedis.multi()) {
            //Remove the specified members from the set stored at key.
            tran.srem(username + ":following", usernameToUnfollow);
            tran.hincrBy("user:" + username, "numFollowing", -1);
            tran.srem(usernameToUnfollow + ":followed", username);
            tran.hincrBy("user:" + usernameToUnfollow, "numFollowers", -1);
            tran.exec();
        }
        return true;
    }

    @Override
    public Set<String> getFollowedUsers(String username) {

        if (!jedis.exists("user:" + username)) return null;
        return jedis.smembers(username + ":following");
    }

    @Override
    public Set<String> getUsersFollowing(String username) {

        if (!jedis.exists("user:" + username)) return null;
        return jedis.smembers(username + ":followed");
    }

}
