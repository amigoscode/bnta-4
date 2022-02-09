package com.amigoscode.examples.flightproject.passenger;


import com.amigoscode.examples.flightproject.flight.FlightService;
import com.amigoscode.examples.flightproject.util.IdGenerator;
import com.amigoscode.examples.flightproject.util.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerService {

    private PassengerDao passengerDao;
    private FlightService flightService;
    private IdGenerator idGenerator;

    public PassengerService(PassengerDao passengerDao, FlightService flightService, IdGenerator idGenerator) {
        this.passengerDao = passengerDao;
        this.flightService = flightService;
        this.idGenerator = idGenerator;
    }

    public Passenger getById(String id) {
        for (Passenger p : passengerDao.getAllPassengers()) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }

    public List<Passenger> filterByName(String name){
        List<Passenger> matched = new ArrayList<>();
        for (Passenger p : passengerDao.getAllPassengers()) {
            if (name.trim().equalsIgnoreCase(p.getName())){ // watch for trims
                matched.add(p);
            }
        }
        return matched;
    }

    public void chooseIdOrName(){
        String[] options = {"Search by name", "Use Id"};
        int option = Interface.getOption("Select a number:", options);
        switch (option){
            case 1:
                enterName();
            break;
            case 2:
                enterId();
            break;
        }
    }

    public void enterId(){
        System.out.println("Please enter your Id:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Passenger passenger = getById(input);
        if (passenger == null){
            System.out.println("Cannot find passenger with that Id");
            chooseIdOrName();
        } else {
            flightService.bookOrDisplay(passenger);
        }
    }

    public void enterName(){
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Passenger> filteredList = filterByName(input);
        if (filteredList.size() == 0){
            System.out.println("No matches found. Please try again");
            enterName();
        } else {
            String[] arr = new String[filteredList.size()];
            for (int i = 0; i < filteredList.size(); i++) {
                arr[i] = displayPassenger(filteredList.get(i));
            }
           int option =  Interface.getOption("Choose a passenger from the list below:", arr);
            Passenger passenger = filteredList.get(option - 1);
            flightService.bookOrDisplay(passenger);
        }
    }

    public void createNewUser(){

        String id = idGenerator.randomIdGenerator(passengerDao.getAllPassengers());

        System.out.println("Please enter your full name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please enter your email:");
        String email = scanner.nextLine();

        System.out.println("Please enter your phone number");
        String phoneNum= scanner.nextLine();

        System.out.println("Please enter your passport number:");
        String passportNum = scanner.nextLine();

        Passenger passenger = new Passenger(id, name, email, phoneNum, passportNum);

        passengerDao.getAllPassengers().add(passenger);
        passengerDao.updateAllPassengers();

        System.out.println(passenger.getName() + " created!");
    }

    public String displayPassenger(Passenger p){
        return p.getId() + " | " + p.getName() + " | " + p.getEmail() + " | " + p.getPassport();
    }
}

