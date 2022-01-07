package com.kodilla.good.patterns.challenges.orderRequest;

import java.time.LocalDateTime;

public class OrderRequestExample implements OrderRepository {
    @Override
    public boolean createOrder(final User user, final LocalDateTime orderDate, final Integer orderID, int quantity,
                               double price) {
        return true;
    }
}
