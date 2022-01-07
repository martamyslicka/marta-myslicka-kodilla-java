package com.kodilla.good.patterns.foodToDoor;

import java.util.List;

public interface OrderService {
    boolean order(List<OrderRequest> orderedList);
}
