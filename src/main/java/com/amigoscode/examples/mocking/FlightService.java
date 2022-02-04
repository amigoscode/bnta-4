package com.amigoscode.examples.mocking;

import java.util.Arrays;

public class FlightService {

    private FlightDAO flightDAO;

    public FlightService(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    public void addFlight(Flight flight) {
        if (flight.getAvailableSeats() <= 0) {
            throw new IllegalStateException("Flight is full");
        }
        flightDAO.saveFlightToFile(flight);
    }

    public Flight[] displayAllFlights() {
        return flightDAO.getFlightsFromFile();
    }

    public Flight[] filterFlight(Destination destination) {
        Flight[] flights = flightDAO.getFlightsFromFile();
        int size = 0;

        for (Flight flight : flights) {
            if (flight.getDestination().equals(destination)) size++;
        }
        int index = 0;
        Flight[] filtered = new Flight[size];
        for (Flight flight : flights) {
            if (flight.getDestination().equals(destination)) {
                filtered[index++] = flight;
            }
        }
        return filtered;
    }
}
