package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList("List no 1","Description no 1");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //then
        assertEquals(1, readTaskList.size());

        //cleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
