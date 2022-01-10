package com.kodilla.good.patterns.flights;

public class Flight {
    private String flightDestination;
    private String flightDeparture;

    public Flight(String flightDeparture, String flightDestination) {
        this.flightDestination = flightDestination;
        this.flightDeparture = flightDeparture;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    @Override
    public boolean equals(Object o) {    if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getFlightDestination().equals(flight.getFlightDestination())) return false;
        return getFlightDeparture().equals(flight.getFlightDeparture());
    }

    @Override
    public int hashCode() {
        int result = getFlightDestination().hashCode();
        result = 31 * result + getFlightDeparture().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  "<<< Flight from: " + flightDeparture +
                " to: " + flightDestination + ">>>";
    }
}
