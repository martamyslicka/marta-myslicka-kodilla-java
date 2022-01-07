package com.kodilla.good.patterns.challenges.orderRequest;

import java.time.LocalDateTime;

public class OrderRequestRetreiver {

    public OrderRequest retreive(){
         User user = new User ("StanisławMroz", "stanislaw.mroz@gmail.com", "785 236 954");
        LocalDateTime orderDate = LocalDateTime.now();
        int orderId = 123;
        int quantity = 123;
        double price = 2.55;
        return new OrderRequest(user, orderDate, orderId, quantity, price);
        }
}
