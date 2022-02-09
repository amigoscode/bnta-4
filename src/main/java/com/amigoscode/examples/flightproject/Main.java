package com.amigoscode.examples.flightproject;

import com.amigoscode.examples.flightproject.flight.FlightDAO;
import com.amigoscode.examples.flightproject.flight.FlightDataAccessService;
import com.amigoscode.examples.flightproject.flight.FlightFileDB;
import com.amigoscode.examples.flightproject.flight.FlightService;
import com.amigoscode.examples.flightproject.passenger.PassengerDao;
import com.amigoscode.examples.flightproject.passenger.PassengerService;
import com.amigoscode.examples.flightproject.util.IdGenerator;
import com.amigoscode.examples.flightproject.util.Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        FlightDAO flightDao = new FlightFileDB();
        FlightDAO flightDao = new FlightDataAccessService();
        PassengerDao passengerDao = new PassengerDao();
        FlightService flightService = new FlightService(flightDao);
        IdGenerator idGenerator = new IdGenerator();
        PassengerService passengerService = new PassengerService(passengerDao, flightService, idGenerator);

        ////////////////////////////////////////////////////////

        System.out.println("Welcome to the Flight Management CLI!");

        String[] options = {
                "Add a flight",
                "Display all flights",
                "Display fully-booked flights",
                "Create a new user",
                "Display flight or book flight for a specific user",
                "Cancel flight",
                "Quit the program"
        };

        while (true) {

            int option = Interface.getOption("Please select your option using the numbers:",
                    options);

            // Switch statements here
            switch (option) {
                case 1:
                    System.out.println("'Add flight' selected.");
                    flightService.addFlight();
                    break;
                case 2:
                    System.out.println("'Display all flights' selected.");
                    flightService.displayAllFlights();
                    break;
                case 3:
                    System.out.println("'Display fully-booked flights' selected.");
                    flightService.displayFullyBooked();
                    break;
                case 4:
                    System.out.println("'Create a new user' selected.");
                    passengerService.createNewUser();
                    break;
                case 5:
                    System.out.println("'Display flight or book a flight for a specific user' selected.");
                    passengerService.chooseIdOrName();
                    break;

                case 6:
                    System.out.println("'Cancel a flight' selected.");
                    flightService.cancelFlight();

                    break;
                case 7:
                    System.out.println("Thanks for using our management system!");
                    System.exit(0);
            }
            System.out.println("Press enter to continue.");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
    }
}







