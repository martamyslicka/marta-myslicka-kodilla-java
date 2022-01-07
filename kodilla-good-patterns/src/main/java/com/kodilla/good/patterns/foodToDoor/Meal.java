package com.kodilla.good.patterns.foodToDoor;

public class Meal {
    private String mealName;
    private double mealPrice;
    private String mealType;

    public Meal(String mealName, double mealPrice, String mealType) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public String getMealType() {
        return mealType;
    }

    @Override
    public String toString() {
        return mealName;
    }


    @Override
    public int hashCode() {
        return getMealType().hashCode();
    }
}
