package com.kodilla.testing.forum.statistic;

import java.util.List;

public interface Statistics {
    List<String> usersNames();
    int postCount();
    int commentsCount();
}
