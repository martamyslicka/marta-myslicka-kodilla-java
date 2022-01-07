package com.kodilla.good.patterns.foodToDoor;

import java.util.ArrayList;
import java.util.List;

public class SupplierOrderService implements OrderService {

    @Override
    public boolean order(List<OrderRequest> orderedList) {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        List<Integer> notProceeding = new ArrayList<>();
        for (int i = 0; i < orderedList.size(); i++) {
            String supplier = orderedList.get(i).getSupplierName();
            if (supplier == "Gluten Free Shop") {
                glutenFreeShop.process(orderedList.get(i));
            } else if (supplier == "Healthy Shop") {
                healthyShop.process(orderedList.get(i));
            } else {
                System.out.println("!!! " + orderedList.get(i).getSupplierName() + " is not our supplier. Proceeding without that order. !!!\n");
                notProceeding.add(i);
            }

        }
        for (Integer i : notProceeding) {
            orderedList.remove(i);
        }
        return true;
    }


}



