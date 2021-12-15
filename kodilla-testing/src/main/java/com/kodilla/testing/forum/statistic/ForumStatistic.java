package com.kodilla.testing.forum.statistic;
import java.util.ArrayList;
import java.util.List;

public class ForumStatistic {

    private Statistics statistics;

    private int forumUserNo;
    private int forumPostsNo;
    private int forumCommentNo;

    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public ForumStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        if (statistics.usersNames().size() == 0 || statistics.postCount() ==0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
            avgCommentsPerPost = 0;
        }else {
            avgPostsPerUser = Double.valueOf(statistics.postCount()) / Double.valueOf(statistics.usersNames().size());
            avgCommentsPerUser = Double.valueOf(statistics.commentsCount()) / Double.valueOf(statistics.usersNames().size());
            avgCommentsPerPost = Double.valueOf(statistics.commentsCount()) / Double.valueOf(statistics.postCount());
        }
    }

    public int getForumUserNo() {
        return forumUserNo;
    }

    public int getForumPostsNo() {
        return forumPostsNo;
    }

    public int getForumCommentNo() {
        return forumCommentNo;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
