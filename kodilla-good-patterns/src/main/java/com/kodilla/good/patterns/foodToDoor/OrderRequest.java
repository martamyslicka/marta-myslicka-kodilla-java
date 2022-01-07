package com.kodilla.good.patterns.foodToDoor;

public class OrderRequest {
    private String supplierName;
    private String mealName;
    private int quantity;

    public OrderRequest(String supplierName, String mealName, int quantity) {
        this.supplierName = supplierName;
        this.mealName = mealName;
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getOrderedMeal() {
        return mealName;
    }


    @Override
    public String toString() {
        return "Order Request{" +
                "Supplier='" + supplierName + '\'' +
                ", Meal=" + mealName +
                ", quantity=" + quantity +
                '}';
    }
}
