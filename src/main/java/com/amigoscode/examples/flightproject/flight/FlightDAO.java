package com.amigoscode.examples.flightproject.flight;

import com.amigoscode.examples.flightproject.passenger.Passenger;

import java.util.List;

public interface FlightDAO {
    List<Flight> getAllFlights();

    void updateAllFlights();
}
