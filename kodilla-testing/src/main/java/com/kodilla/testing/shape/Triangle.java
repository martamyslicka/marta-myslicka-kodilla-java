package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double field;
    private String shape;

    public Triangle(double field) {
        this.field = field;
    }
    @Override
    public double getShapeField() {
        return field;
    }
    @Override
    public String getShapeName() {
        return "Traingle";
    }

}
