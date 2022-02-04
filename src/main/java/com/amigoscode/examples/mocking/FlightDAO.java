package com.amigoscode.examples.mocking;

public class FlightDAO {

    public Flight[] getFlightsFromFile() {
        System.out.println("Getting flights from file");
        // This data comes from a file
        Flight italia = new Flight("123", Destination.ITALIA, 100);
        Flight spain = new Flight("3", Destination.SPAIN, 100);
        Flight us = new Flight("13", Destination.US, 100);
        return new Flight[]{italia, spain, us};
    }

    public void saveFlightToFile(Flight flight) {
        System.out.println("Saving flight to file");
        System.out.println(flight);
        System.out.println("Saved flight to file");
    }

}
