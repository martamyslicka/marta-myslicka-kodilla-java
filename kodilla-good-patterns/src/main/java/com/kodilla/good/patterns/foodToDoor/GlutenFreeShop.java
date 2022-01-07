package com.kodilla.good.patterns.foodToDoor;

import java.util.ArrayList;
import java.util.List;


public class GlutenFreeShop implements Supplier{
    SmsInformation smsInformation = new SmsInformation();

    private String supplierName;
    private List<Meal> menu = new ArrayList<>();

    public void GlutenFreeShop() {
        this.supplierName = "Gluten Free Shop";
        createMenu();
    }

    public String getSupplierName() {
        return supplierName;
    }


    public void createMenu() {
        Meal meal1 = new Meal("meal11", 15.99, "vege");
        Meal meal2 = new Meal("meal22", 25.00, "fish");

        menu.add(meal1);
        menu.add(meal2);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Gluten Free ordering process starts here >>>");
        createMenu();
        if (checkMeal(orderRequest)) {
            System.out.println("Accepted order: \n" + orderRequest.toString());
            smsInformation.inform(orderRequest.getSupplierName());
        } else {
            System.out.println("Supplier " + orderRequest.getSupplierName() + " does not provide " + orderRequest.getOrderedMeal());
        }
        System.out.println("<<<Gluten Free ordering process ends here \n");
    }

    private boolean checkMeal(OrderRequest order) {
        List<String> menuMeals = new ArrayList<>();
        for (Meal meal : menu) {
            menuMeals.add(meal.getMealName());
        }
        if (menuMeals.contains(order.getOrderedMeal())) {
            return true;
        } else {
            return false;
        }
    }
}
