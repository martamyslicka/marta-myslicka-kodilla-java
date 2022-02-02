package com.kodilla.good.patterns.foodToDoor;

import java.util.List;

public interface OrderRepository {
    public boolean createOrder(List<OrderRequest> orderedList);
}
