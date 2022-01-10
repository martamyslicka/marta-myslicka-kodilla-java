package com.kodilla.good.patterns.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FlightsTestSuite {
    @Test
    public void shouldFindFlightsFrom() {
        //Given
        FlightsSearcher searcher = new FlightsSearcher();

        //When
        List<Flight> expected = new ArrayList<>();
        List<Flight> flights = searcher.findFlightFromItemAirport("Warszawa");
        expected.add(new Flight("Warszawa", "Oslo"));
        expected.add(new Flight("Warszawa", "Berlin"));

        //Then
        Assertions.assertEquals(2, flights.size());
    }

    @Test
    public void shouldNotFindFlightsFrom() {
        //Given
        FlightsSearcher searcher = new FlightsSearcher();

        //When
        List<Flight> flights = searcher.findFlightFromItemAirport("Szczedrzykowice");

        //Then
        Assertions.assertTrue(flights.isEmpty());
    }

    @Test
    public void shouldFindFlightsTo() {
        //Given
        FlightsSearcher searcher = new FlightsSearcher();

        //When
        List<Flight> expected = new ArrayList<>();
        List<Flight> flights = searcher.findFlightToItemAirport("Praha");
        expected.add(new Flight("Oslo", "Praha"));
        expected.add(new Flight("Berlin", "Praha"));

        //Then
        Assertions.assertEquals(2, flights.size());
    }

    @Test
    public void shouldNotFindFlightsTo() {
        //Given
        FlightsSearcher searcher = new FlightsSearcher();

        //When
        List<Flight> flights = searcher.findFlightToItemAirport("Szczedrzykowice");

        //Then
        Assertions.assertTrue(flights.isEmpty());

    }

    @Test
    public void shouldFindTransitFlights() {
        //Given
        FlightsSearcher searcher = new FlightsSearcher();

        //When
        List<Flight> expected = new ArrayList<>();
        List<Flight> flights = searcher.findFTransitFlight("Warszawa", "Praha");
        expected.add(new Flight("Warszawa", "Oslo"));
        expected.add(new Flight("Oslo", "Praha"));
        expected.add(new Flight("Warszawa", "Berlin"));
        expected.add(new Flight("Berlin", "Praha"));

        //Then
        Assertions.assertEquals(4, flights.size());
    }

    @Test
    public void shouldNotFindTransitFlights(){
        //Given
        FlightsSearcher searcher = new FlightsSearcher();

        //When
        List<Flight> flights = searcher.findFTransitFlight("Warszawa", "Szczedrzykowice");

        //Then
        Assertions.assertTrue(flights.isEmpty());

    }
}