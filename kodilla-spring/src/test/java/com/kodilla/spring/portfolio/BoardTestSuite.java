package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("To do: make a draft");
        board.getInProgressList().getTasks().add("In progress: make a draft v. 2");
        board.getDoneList().getTasks().add("Done: make a draft v. 1");
        String toDoTask = board.getToDoList().getTasks().get(0);
        String inProgressTask = board.getInProgressList().getTasks().get(0);
        String doneTask = board.getDoneList().getTasks().get(0);
        //Then
        assertEquals(toDoTask, "To do: make a draft");
        assertEquals(inProgressTask, "In progress: make a draft v. 2");
        assertEquals(doneTask, "Done: make a draft v. 1");
    }
}