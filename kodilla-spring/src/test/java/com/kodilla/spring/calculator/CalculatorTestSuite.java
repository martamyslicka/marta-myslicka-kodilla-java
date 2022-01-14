package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){

        //given
        double a = 8;
        double b = 4;

        //when
        double resAdd = calculator.add(a, b);
        double resSub = calculator.sub(a, b);
        double resMul = calculator.mul(a, b);
        double resDiv = calculator.div(a, b);

        //then
        assertEquals(12, resAdd);
        assertEquals(4, resSub);
        assertEquals(32, resMul);
        assertEquals(2, resDiv);

    }

}
