package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigMacTestSuit {
    @Test
    void testBicMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(true)
                .burgers(3)
                .ingredient("Onion")
                .ingredient("Chilli pepper")
                .sauce("Standard")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
        assertTrue(bigMac.getBun());
        assertEquals(3, bigMac.getBurgers());
        assertEquals("Standard", bigMac.getSauce());
    }
}
