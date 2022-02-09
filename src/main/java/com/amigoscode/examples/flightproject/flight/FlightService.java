package com.amigoscode.examples.flightproject.flight;


import com.amigoscode.examples.flightproject.passenger.Passenger;
import com.amigoscode.examples.flightproject.util.Interface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightService {

    private FlightDAO flightDao;
    public FlightService(FlightDAO flightDao) {
        this.flightDao = flightDao;
    }

    public void addFlight() {
        System.out.println("Flight Code?");

        Scanner scanner = new Scanner(System.in);
        String flightCode = scanner.nextLine();


        System.out.println("Destination?\n1. Germany\n2. China\n3. France\n4. Denmark\n5. UAE\n6. USA\n7. Czech Republic");
        String selection = scanner.nextLine();
        Destination destination = null;


        switch (selection){
            case "1":
                destination = Destination.BER;
                break;
            case "2":
                destination = Destination.BJS;
                break;
            case "3":
                destination = Destination.BOD;
                break;
            case "4":
                destination = Destination.CPH;
                break;
            case "5":
                destination = Destination.DXB;
                break;
            case "6":
                destination = Destination.LAX;
                break;
            case "7":
                destination = Destination.PRG;
                break;
            default:
                System.out.println("Not a valid choice.");
                addFlight();
        }

        System.out.println("Departure Date/Time:");
        System.out.println("Year?");
        int year = scanner.nextInt();
        System.out.println("Month?");
        int month = scanner.nextInt();
        System.out.println("Day?");
        int day = scanner.nextInt();
        System.out.println("Hour?");
        int hour = scanner.nextInt();
        System.out.println("Minute?");
        int minute = scanner.nextInt();
        // create date time with given values
        LocalDateTime departureTime = LocalDateTime.of(year, month, day, hour, minute);

        System.out.println("Flight capacity?");
        int capacity = scanner.nextInt();

        Flight flight = new Flight(flightCode, destination, departureTime, capacity);

        flightDao.getAllFlights().add(flight);
        flightDao.updateAllFlights();
    }
    // All flights
    public static int availableSeats(Flight flight){
        int counter = 0;
        for (String passenger : flight.getPassengerIds()) {
            if (passenger == null){
                counter++;
            }
        }
        return counter;
    }

    public static String displayFlight(Flight flight){
        return flight.getFlightCode() + " | " + "Destination: " + flight.getDestination() + " | " + "Departure time: " + flight.getDepartureTime() + " | " + "Available seats: " + availableSeats(flight);
    }

    public void displayAllFlights(){
        for (Flight flight : flightDao.getAllFlights()) {
            System.out.println("--------------------");
            System.out.println(displayFlight(flight));
        }
    }

    public void displayFullyBooked(){
        System.out.println("Fully booked flights:");
        for (Flight flight : flightDao.getAllFlights()) {
            if (availableSeats(flight) == 0){
                System.out.println(displayFlight(flight));
                System.out.println("--------------------");
            }
        }
    }

    public void addPassengerToFlight(Passenger passenger, Flight flight){
        for (int i = 0; i < flight.getPassengerIds().length; i++) {
            if (flight.getPassengerIds()[i] == null){
                flight.getPassengerIds()[i] = passenger.getId();
                flightDao.updateAllFlights();
                break;
            }
        }
    }

    public boolean onFlight(Passenger passenger, Flight flight){
        for (String passengerId : flight.getPassengerIds()) {
            if (passenger.getId().equals(passengerId)){
                return true;
            }
        }
        return false;
    }

    public void checkPassengerFlights(Passenger passenger){
        List<Flight> onboard = new ArrayList<>();
        for (Flight flight : flightDao.getAllFlights()) {
            if (onFlight(passenger, flight)){
                onboard.add(flight);
            }
        }
        System.out.println("Flights for passenger: " + passenger.getName());
        if (onboard.size() > 0){
            for (Flight flight : onboard) {
                System.out.println(displayFlight(flight));
            }
        } else {
            System.out.println("No flights booked for " + passenger.getName() +".");
            bookOrDisplay(passenger);
        }
        System.out.println("---------------------");
    }

    public Flight getFlightByCode(String code){
        for (Flight f : flightDao.getAllFlights()) {
            if (code.equalsIgnoreCase(f.getFlightCode())){
                return f;
            }
        }
        return null;
    }

    public void cancelFlight(){
        displayAllFlights();
        System.out.println("Enter flight code to cancel:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        Flight flight = getFlightByCode(code);
        if (flight == null){
            System.out.println("Flight not found.");
        } else {
            flightDao.getAllFlights().remove(flight);
            flightDao.updateAllFlights();
            System.out.println("Flight " + flight.getFlightCode() + " cancelled.");
            displayAllFlights();
        }
    }

    public void bookOrDisplay(Passenger p){
        String[] options = {"Book a flight for " + p.getName(), "Display booked flights for " + p.getName()};
        int option = Interface.getOption("Would you like to:", options);

        switch (option){
            case 1:
                findAvailableFlights(p);
                break;
            case 2:
                checkPassengerFlights(p);
                break;
        }
    }

    public void findAvailableFlights(Passenger p){
        List<Flight> availableFlights = new ArrayList<>();
        for (Flight f : flightDao.getAllFlights()) {
            if (availableSeats(f) > 0 && !onFlight(p, f)){
                availableFlights.add(f);
            }
        }
        if (availableFlights.size() == 0){
            System.out.println("No available flights.");
        } else {
            String[] arr = new String[availableFlights.size() + 1];
            for (int i = 0; i <= availableFlights.size(); i++) {
                if (i == availableFlights.size()){
                    arr[i] = "Exit";
                    break;
                }
                arr[i] = displayFlight(availableFlights.get(i));
            }
            int option = Interface.getOption("Pick an available flight below:", arr);
            if (option <= availableFlights.size()){
                addPassengerToFlight(p, availableFlights.get(option -1));
                System.out.println("Flight booked for " + p.getName() + "!");
            }
        }
    }
}
