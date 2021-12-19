package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String nickName;
    private final char sex;
    private final LocalDate birthDay;
    private final int postNo;

    public ForumUser(final int id, final String nickName, final char sex, final int year, final int month,
                     final int day, final int postNo) {
        this.id = id;
        this.nickName = nickName;
        this.sex = sex;
        this.birthDay = LocalDate.of(year, month, day);
        this.postNo = postNo;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostNo() {
        return postNo;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postNo=" + postNo +
                '}';
    }
}
