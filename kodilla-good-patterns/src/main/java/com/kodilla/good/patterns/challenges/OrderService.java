package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean createOrder(final User user, final LocalDateTime orderDate, final Integer orderID, int quantity,
                               double price);
}
