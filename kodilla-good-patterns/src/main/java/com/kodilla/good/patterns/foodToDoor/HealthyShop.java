package com.kodilla.good.patterns.foodToDoor;

import java.util.ArrayList;
import java.util.List;



public class HealthyShop implements Supplier {

    SmsInformation smsInformation = new SmsInformation();

    private String supplierName;
    private List<Meal> menu = new ArrayList<>();

    public void HealthyShop() {
        this.supplierName = "Healthy Shop";
        createMenu();
    }

    public String getSupplierName() {
        return supplierName;
    }


    public void createMenu() {
        Meal meal1 = new Meal("meal1", 15.99, "vegetarian");
        Meal meal2 = new Meal("meal2", 25.00, "meat");

        menu.add(meal1);
        menu.add(meal2);

    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("This is Healthy Shop process >>>>");
        createMenu();
        if (checkStock(orderRequest)) {
            System.out.println("Accepted order: \n" + orderRequest.toString());
            smsInformation.inform(orderRequest.getSupplierName());
        } else {
            System.out.println("Supplier " + orderRequest.getSupplierName() + " does not provide "
                    + orderRequest.getOrderedMeal());
        }
        System.out.println("<<<< Healthy Shop THE END \n");

    }
        public boolean checkStock(OrderRequest order) {
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
