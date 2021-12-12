package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double field;

    public Circle(double field) {
        this.field = field;
    }
    @Override
    public double getShapeField() {
        return field;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }
}