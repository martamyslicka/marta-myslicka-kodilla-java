package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;

import java.util.stream.Collectors;
import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultForumUsers = forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (forumUser.getBirthDay().getYear()) <= (LocalDate.now().getYear() - 20 ))
                .filter(forumUser -> forumUser.getPostNo() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

                System.out.println("# elements: " + theResultForumUsers.size());            
                theResultForumUsers.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);  









    }

}
