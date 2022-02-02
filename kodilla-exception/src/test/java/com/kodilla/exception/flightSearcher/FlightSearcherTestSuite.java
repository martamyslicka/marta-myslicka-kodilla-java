package com.kodilla.exception.flightSearcher;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlightSearcherTestSuite {

    @Test
    void testFindFlight() {
        // given
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight = new Flight("Warsaw", "Krakow");

        // when & then
        assertDoesNotThrow(() -> flightSearcher.findFlight(flight));
    }

    @Test
    void testFindFlight2() {
        // given
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight2 = new Flight("Warsaw", "Maroko");

        // when & then
        assertThrows(Exception.class, () -> flightSearcher.findFlight(flight2));
    }

    @Test
    void testFindFlight3() {
        // given
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight3 = new Flight("Whatever", "Gdansk");

        // when
        //String result = flight3.getArrivalAirport();
        //String expected = "The airport " + result + "is not available for the moment";

        //then
        assertDoesNotThrow(() -> flightSearcher.findFlight(flight3));
    }

}
