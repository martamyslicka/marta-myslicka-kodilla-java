package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime dateOfOrder;
    private Integer orderId;
    private Integer quantity;
    private double price;

    public OrderRequest(User user, LocalDateTime dateOfOrder, Integer orderId, Integer quantity, double price) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
