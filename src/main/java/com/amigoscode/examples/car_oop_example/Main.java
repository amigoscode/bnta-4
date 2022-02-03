package com.amigoscode.examples.car_oop_example;

import com.amigoscode.examples.car_oop_example.car.Car;
import com.amigoscode.examples.car_oop_example.garage.Garage;
import com.amigoscode.examples.car_oop_example.garage.GarageService;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(
                "Honda",
                "1234",
                false
        );

        Object copy = new Car(
                "Honda",
                "1234",
                false
        );





        System.out.println(car == copy);
        System.out.println(car.equals(copy));




        Car nullCAr = null;
        Person person = new Person("", 0, "", null);
        System.out.println(car.getClass());
        System.out.println(person.getClass());

        Car tesla = new Car(
                "Tesla",
                "1234",
                true
        );

        Car mini = new Car(
                "mini",
                "1234",
                false
        );

        Car[] connieCars = {car, tesla};

        Person connie = new Person(
                "Connie",
                24,
                "connie@gmail.com",
                connieCars
        );

        Garage conniesGarage = new Garage(
                connie,
                1,
                3
        );

        GarageService garageService = new GarageService();

        conniesGarage.setOpen(true);

        //
//        garageService.addCar(
//                conniesGarage,
//                connie.getCars()[0]
//        );

        //  adds all cars
        for (Car connieCar : connie.getCars()) {
            garageService.addCar(
                    conniesGarage,
                    connieCar
            );

        }

        System.out.println(conniesGarage);
        for (Car c : conniesGarage.getCars()) {
            System.out.println(c);
        }

        int currentCarsInGarageCount = 0;
        for (Car c : conniesGarage.getCars()) {
            if (c != null) {
                currentCarsInGarageCount++;
            }
        }
        System.out.println(currentCarsInGarageCount);

        System.out.println("Electric Cars");
        Car[] electricCars = garageService.filterByElectric(conniesGarage, false);
        for (Car c : electricCars) {
            System.out.println(c);
        }

    }
}
