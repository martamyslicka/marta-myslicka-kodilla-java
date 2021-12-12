package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector {

    private ArrayList<Shape> figureList = new ArrayList<>();

    public boolean addShape(Shape shape){
        boolean result = false;
        figureList.add(shape);
        if (figureList.contains(shape)){
            result = true;
        }
        return result;
    }

    public boolean removeShape(Shape shape){
        boolean result = false;
        if(figureList.contains(shape)){
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure (int n) {
        if(n >= 0 && n < figureList.size()) {
            return figureList.get(n);
        }
        return null;
    }

    public String showFigures(){
        String result = "";
        for (int i =0; i < (figureList.size()-1); i++) {
            result+=((figureList.get(i)).getShapeName()+", ");
        }
        return result = result + figureList.get(figureList.size()-1).getShapeName();

    }

}
