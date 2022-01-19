package com.kodilla.patterns.singleton;

import com.kodilla.patterns.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void createLog() {
        logger = Logger.INSTANCE;
        logger.log("4 actionable tasks: 3 executed, 1 up-to-date ");
    }

    @Test
    void testGetLastLog() {
        //given
        //when
        String result = logger.getLastLog();
        //then
        assertEquals("4 actionable tasks: 3 executed, 1 up-to-date ", result);

    }
}
