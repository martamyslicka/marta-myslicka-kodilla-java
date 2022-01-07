package com.kodilla.good.patterns.foodToDoor;

import java.util.List;

public class SingleOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(List<OrderRequest> orderList){
        return true;
    }

}
