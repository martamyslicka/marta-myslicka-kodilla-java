package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingList() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shoppingList = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //then
        assertEquals("Lidl", shoppingList.getTaskName());
        assertFalse(shoppingList.isTaskExecuted());
        shoppingList.executeTask();
        assertTrue(shoppingList.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task paintingTask = taskFactory.makeTask(TaskFactory.PaintingTask);
        //then
        assertEquals("Nature", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testDrivingTest() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task drivingTask = taskFactory.makeTask(TaskFactory.DrivingTask);
        //then
        assertEquals("holiday", drivingTask.getTaskName());
        assertEquals("holiday", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        assertTrue(drivingTask.isTaskExecuted());
    }

}
