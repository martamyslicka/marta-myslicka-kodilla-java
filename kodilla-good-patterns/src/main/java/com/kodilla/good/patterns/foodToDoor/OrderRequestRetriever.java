package com.kodilla.good.patterns.foodToDoor;

import java.util.ArrayList;
import java.util.List;



public class OrderRequestRetriever {
    List<OrderRequest> orderedList = new ArrayList<>();

    public OrderRequestRetriever() {
        createOrderedList();
    }

    public void createOrderedList() {
        //OrderRequest one = new OrderRequest("Healthy Shop", "meal1", 2) ;
        //OrderRequest two = new OrderRequest("Gluten Free Shop", "meal11", 25);
        //OrderRequest three = new OrderRequest("Szczedrzykowice Shop", "something", 4);
        //OrderRequest four = new OrderRequest("Healthy Shop", "meal44", 2) ;

        //orderedList.add(one);
        //orderedList.add(two);
        //orderedList.add(three);
        //orderedList.add(four);
    }

    public List<OrderRequest> getOrderedProductList() {
        return orderedList;
    }



}
