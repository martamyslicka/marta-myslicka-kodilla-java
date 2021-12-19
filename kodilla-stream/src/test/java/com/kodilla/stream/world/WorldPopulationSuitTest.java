package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldPopulationSuitTest {

    @Test
    void testGetPeopleQuantity() {

        //given
        Continent europa = new Continent ("Europe");
        europa.addCountry( new Country ("Czech Republic", new BigDecimal("24000000")));
        Continent africa = new Continent("Africa");
        africa.addCountry( new Country("Uganda", new BigDecimal(12000000)));
        africa.addCountry( new Country("Somalia", new BigDecimal("3000000")));
        Continent asia = new Continent("Asia");
        asia.addCountry( new Country("Japan", new BigDecimal(55000000)));

        World world = new World();
        world.addContinent(europa);
        world.addContinent(africa);
        world.addContinent(asia);

        //when
        BigDecimal expectedPopulation = new BigDecimal(94000000);
        BigDecimal population = world.getPeopleQuantity();

        //then
        assertEquals(population, expectedPopulation);


    }

}