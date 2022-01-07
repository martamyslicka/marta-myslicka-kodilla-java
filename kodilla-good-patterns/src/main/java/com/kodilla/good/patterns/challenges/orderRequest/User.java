package com.kodilla.good.patterns.challenges.orderRequest;

public class User {
    private String name;
    private String mail;
    private String phoneNumber;

    public User(String name, String mail, String phoneNumber) {
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
