package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {
        FlightsSearcher flightsSearcher = new FlightsSearcher();

        System.out.println(flightsSearcher.findFlightFromItemAirport("Oslo"));
        System.out.println(flightsSearcher.findFlightToItemAirport("Szczedrzykowice"));
        System.out.println(flightsSearcher.findFTransitFlight("Warszawa",  "Praha"));
    }
}
