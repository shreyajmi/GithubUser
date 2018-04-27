package com.example.android.datafrominternet;

import java.util.Comparator;

/**
 * Created by Shreya on 27-04-2018.
 */

public class GithubUser
{
    private String userID;
    private String score;

    public GithubUser(String userID, String score)
    {
        this.userID = userID;
        this.score = score;
    }

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public String getScore()
    {
        return score;
    }

    public void setScore(String score)
    {
        this.score = score;
    }

    public boolean compareTo(GithubUser compareUser){
        double score1 = Double.parseDouble(compareUser.getScore());
        double score2 = Double.parseDouble(this.getScore());

        if(score1>score2)return true;
        return false;
    }
    public static Comparator<GithubUser> GithubUserComparator
            = new Comparator<GithubUser>() {

        public int compare(GithubUser user1, GithubUser user2) {


            //ascending order
            if(user1.compareTo(user2) == true)return 1;
            return -1;
            //descending order
            //return user2.compareTo(usre2);
        }

    };


}
