package dk.cphbusiness.mrv.twitterclone.dto;

public class UserOverview {
    public String username;
    public String firstname;
    public String lastname;
    public int numFollowers;
    public int numFollowing;

    public UserOverview(String username, String firstname, String lastname, int numFollowers, int numFollowing) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.numFollowers = numFollowers;
        this.numFollowing = numFollowing;
    }
}
