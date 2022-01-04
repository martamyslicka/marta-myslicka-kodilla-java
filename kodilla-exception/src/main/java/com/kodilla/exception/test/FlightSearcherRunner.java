package com.kodilla.exception.test;

public class FlightSearcherRunner {
    public static void main(String args[]) {


        Flight flight = new Flight("Warsaw", "Krakow");
        Flight flight2 = new Flight("Warsaw", "Maroko");

        FlightSearcher flightFinder = new FlightSearcher();
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
