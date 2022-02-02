package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        System.out.println("Searching for flight from "
                + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());

        Map<String, Boolean> directions = new HashMap<>();
        directions.put("Warsaw", true);
        directions.put("Praha", false);
        directions.put("Krakow", true);
        directions.put("Gdansk", false);
        directions.put("Lodz", true);

        String result = flight.getArrivalAirport();

        if (directions.containsKey(result)) {
            if (!directions.get(result)) {
                System.out.println("The airport " + result + "is not available for the moment");
            } else {
                System.out.println("Founded flight to: " + result);
            }
        } else {
            throw new RouteNotFoundException("There are no flights to: " + result);
        }

    }
}

