package com.bnta.examples.car_oop_example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Honda",
                "1234",
                false
        );

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

        System.out.println(garageService.getTotalNumberOfCarsInGarage(conniesGarage));


    }
}
