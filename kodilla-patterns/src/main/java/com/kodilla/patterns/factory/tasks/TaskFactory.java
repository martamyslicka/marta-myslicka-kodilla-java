package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case ShoppingTask:
                return new ShoppingTask("Lidl", "milk", 2 );
            case PaintingTask:
                return new PaintingTask("Nature", "yellow", "sun");
            case DrivingTask:
                return new DrivingTask("holiday", "Maroko", "ship");

            default:
                return null;
        }
    }
}
