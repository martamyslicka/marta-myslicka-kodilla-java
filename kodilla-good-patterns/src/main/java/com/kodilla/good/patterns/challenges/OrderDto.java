package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private boolean ifOrdered;

    public OrderDto(User user, boolean ifOrdered) {
        this.user = user;
        this.ifOrdered = ifOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isIfOrdered() {
        return ifOrdered;
    }


}
