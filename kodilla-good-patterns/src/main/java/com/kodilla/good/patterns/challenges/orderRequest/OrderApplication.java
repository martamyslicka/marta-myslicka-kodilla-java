package com.kodilla.good.patterns.challenges.orderRequest;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetreiver orderRequestRetreiver = new OrderRequestRetreiver();
        OrderRequest orderRequest = orderRequestRetreiver.retreive();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailInformationServices(), new SomethingOrderRepository(), new OrderRequestExample());

        productOrderService.process(orderRequest);
        }
    }



