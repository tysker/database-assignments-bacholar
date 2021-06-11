package dk.cphbusiness.mrv.twitterclone.impl;

import dk.cphbusiness.mrv.twitterclone.contract.PostManagement;
import dk.cphbusiness.mrv.twitterclone.dto.Post;
import dk.cphbusiness.mrv.twitterclone.util.Time;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PostManagementImpl implements PostManagement {
    private Jedis jedis;
    private Time time;

    public PostManagementImpl(Jedis jedis, Time time) {
        this.jedis = jedis;
        this.time = time;
    }

    @Override
    public boolean createPost(String username, String message) {

        if (!jedis.exists("user:" + username)) return false;

        // https://redis.io/commands/zadd
        // Adds all the specified members with the specified scores to the sorted set stored at key.
        jedis.zadd(username + ":tweets", time.getCurrentTimeMillis(), message);

        return true;
    }

    @Override
    public List<Post> getPosts(String username) {

        var posts = jedis.zrange(username + ":tweets", 0, -1);

        return posts.stream().map(post -> {
            return new Post(100, post);

        }).collect(Collectors.toList());
    }

    @Override
    public List<Post> getPostsBetween(String username, long timeFrom, long timeTo) {

        var posts = jedis.zrangeByScoreWithScores(username + ":tweets", timeFrom, timeTo);
        return posts.stream().map(post -> {
            return new Post((long) post.getScore(), post.getElement());
        }).collect(Collectors.toList());
    }
}
