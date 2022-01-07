package com.kodilla.good.patterns.challenges.orderRequest;

public class ProductOrderService {
    private InformationServices informationServices;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationServices informationServices, OrderService orderService,
                               OrderRepository orderRepository) {
        this.informationServices = informationServices;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getDateOfOrder(),
                orderRequest.getOrderId(), orderRequest.getQuantity(), orderRequest.getPrice());
        if(isOrdered) {
            informationServices.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDateOfOrder(),
                    orderRequest.getOrderId(), orderRequest.getQuantity(), orderRequest.getPrice());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
