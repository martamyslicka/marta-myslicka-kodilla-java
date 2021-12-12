package com.kodilla.testing.shape;

public class Square implements Shape {

    private double field;

    public Square(double field) {
        this.field = field;
    }
    @Override
    public double getShapeField() {
        return field;
    }
    @Override
    public String getShapeName() {
        return "Square";
    }

}
