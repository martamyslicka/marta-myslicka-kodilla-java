package com.kodilla.good.patterns.foodToDoor;

import java.util.List;



public class OrderProcessor {
    private final OrderRepository orderRepository;
    private final OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderRepository orderRepository,
                          OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public void process(final List<OrderRequest> orderedList) {
        boolean isOrdered = orderService.order(orderedList);
        if (isOrdered && orderedList.size() > 0) {
            for (OrderRequest order : orderedList) {
                orderRepository.createOrder(orderedList);
            }
            System.out.println("Order proceeding is finished ");

        } else {
            System.out.println("Meals that you have ordered are not provided by our suppliers.");
        }


    }
}

