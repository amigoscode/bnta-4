package com.amigoscode.examples.flightproject.flight;

import java.time.LocalDateTime;
import java.util.List;

public class FlightDataAccessService implements FlightDAO {
    @Override
    public List<Flight> getAllFlights() {
        return List.of(
                new Flight(
                        "22222",
                        Destination.LAX,
                        LocalDateTime.now(),
                        100
                )
        );
    }

    @Override
    public void updateAllFlights() {

    }
}
