package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearcher {
    private List<Flight> flights = new ArrayList<>();

    public FlightsSearcher() {
        flights.add(new Flight("Warszawa", "Oslo"));
        flights.add(new Flight("Oslo", "Praha"));
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Berlin", "Praha"));
        flights.add(new Flight("Praha", "Warszawa"));
        flights.add(new Flight("Berlin", "Warszawa"));
    }

    public List<Flight> findFlightToItemAirport(String destinationAirport) {
        List<Flight> theResult = flights.stream()
                .filter(flight -> flight.getFlightDestination().equals(destinationAirport))
                .collect(Collectors.toList());

        System.out.println("These are all flights TO "+ destinationAirport );
        return theResult;

    }

    public List<Flight> findFlightFromItemAirport(String departureAirport) {
        List<Flight> theResult = flights.stream()
                .filter(flight -> flight.getFlightDeparture().equals(departureAirport))
                .collect(Collectors.toList());

        System.out.println("These are all flights FROM "+ departureAirport );
        return theResult;

    }


    public List<Flight> findFTransitFlight(String departureAirport, String destinationAirport) {
        List<Flight> flightsFrom = flights.stream()
                .filter(flight -> flight.getFlightDeparture().equals(departureAirport))
                .collect(Collectors.toList());
        List<Flight> flightsTo = flights.stream()
                .filter(flight -> flight.getFlightDestination().equals(destinationAirport))
                .collect(Collectors.toList());
        List<Flight> transitList = new ArrayList<>();
        for (Flight startingFlight : flightsFrom) {
            for (Flight departingFlight : flightsTo) {
                if(startingFlight.getFlightDestination().equals(departingFlight.getFlightDeparture())) {
                    transitList.add(new Flight(startingFlight.getFlightDeparture(), departingFlight.getFlightDeparture()));
                    transitList.add(new Flight(startingFlight.getFlightDestination(),
                            departingFlight.getFlightDestination()));
                }
            }
        }
        System.out.println("Transit flights from " + departureAirport + " to " + destinationAirport);
        return transitList;
    }
}


