package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "morning Dew", 'F',
                1998,12,12, 56));
        forumUsersList.add(new ForumUser(2, "Penelope X", 'F',
                1991,10,2, 2));
        forumUsersList.add(new ForumUser(3, "Romualdo", 'M',
                1988,10,2, 58));
        forumUsersList.add(new ForumUser(4, "Xmas Grinch", 'M',
                1975,3,12, 125));
        forumUsersList.add(new ForumUser(5, "hard Worker", 'F',
                2010,6,13, 15));

    }

    public List<ForumUser> getForumUsersList(){
        return new ArrayList<>(forumUsersList);
    }
}
