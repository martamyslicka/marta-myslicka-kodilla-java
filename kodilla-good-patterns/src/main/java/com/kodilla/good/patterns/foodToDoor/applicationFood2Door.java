package com.kodilla.good.patterns.foodToDoor;

import java.util.List;

public class applicationFood2Door {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderProcessor orderProcessor = new OrderProcessor(new SmsInformation(), new SingleOrderRepository(),
        new SupplierOrderService());
        List<OrderRequest> orderedProducts = orderRequestRetriever.getOrderedProductList();

        orderProcessor.process(orderedProducts);

    }
}
