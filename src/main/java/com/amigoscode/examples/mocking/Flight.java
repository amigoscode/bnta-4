package com.amigoscode.examples.mocking;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private Destination destination;
    private int availableSeats;

    public Flight(String flightNumber, Destination destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination=" + destination +
                ", capacity=" + availableSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return availableSeats == flight.availableSeats && Objects.equals(flightNumber, flight.flightNumber) && destination == flight.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, destination, availableSeats);
    }
}
