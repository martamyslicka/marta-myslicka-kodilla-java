package com.kodilla.good.patterns.challenges.orderRequest;

import java.time.LocalDateTime;

public class SomethingOrderRepository implements OrderService {
    @Override
    public boolean createOrder(final User user, final LocalDateTime orderDate, final Integer orderID, int quantity,
                               double price) {
        System.out.println("User " + user + " made an order number " + orderID + ". Payment: "
                + quantity*price + " PLN.");
        return true;
    }
}
