package com.amigoscode.examples.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        ElectricScooter scooter = new ElectricScooter();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);
//        vehicles.add(scooter);

        Person suraya = new Person("Suraya", vehicles);

        for (Vehicle vehicle : suraya.getVehicles()) {
            vehicle.move();
            System.out.println();
        }


    }
}
