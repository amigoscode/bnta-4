package com.amigoscode.examples.car_oop_example.garage;

import com.amigoscode.examples.car_oop_example.car.Car;

import java.util.Arrays;

public class GarageService {
    // This class performs all business logic for the following:
    // 1. add cars
    // 2. how many cars in the garage
    // 3. number of free spots in garage
    // 4. remove car
    // 5. Open and close garage
    // 6. isGarageFull
    // 7. filter electric cars
    // 8. filter non electric cars
    // 9. Clean garage. Remove all cars and put them back and in between print garage cleaned
    // 10. Create GarageDAO class and store current cars in garage to a file
    // 11. Create a second method to read cars from a file

    // 1. add cars

    public void addCar(Garage garage, Car car) {
        // check if open
        // if open check not full
        // then add car to garage
        // if full throw exception
        // if not open throw exception
        if (garage.isOpen()) {
            int currentCarsInGarageCount = getCurrentCarsInGarageCount(garage);
            if (currentCarsInGarageCount < garage.getCapacity()) {
                for (int i = 0; i < garage.getCars().length; i++) {
                    if (garage.getCars()[i] == null) {
                        garage.getCars()[i] = car;
                        break;
                    }
                }
            } else {
                throw new IllegalStateException(garage.getGarageNumber() + " is full. Sorry :(");
            }
        } else {
            throw new IllegalStateException(garage.getGarageNumber() + " is closed. Please open before adding your car");
        }
    }

    // 2. how many cars in the garage
    public int getCurrentCarsInGarageCount(Garage garage) {
        int currentCarsInGarageCount = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                currentCarsInGarageCount++;
            }
        }
        return currentCarsInGarageCount;
    }

    // 3. number of free spots in garage
    public int getFreeSpacesInGarageCount(Garage garage) {
        int freeSpaces = 0;
        for (Car c : garage.getCars()) {
            if (c == null) {
                freeSpaces++;
            }
        }
        return freeSpaces;
    }

    // 4. remove car
    public boolean removeCar(Garage garage, Car car) {
        // find current car position in array and set it to null.
        // then return true meaning car was removed
        // otherwise false
        for (int i = 0; i < garage.getCars().length; i++) {
            if (car.equals(garage.getCars()[i])) {
                garage.getCars()[i] = null;
                return true;
            }
        }
        return false;
    }

    // 5 Open garage
    public void openOrGarage(Garage garage) {
        // !garage.isOpen() means is true make it false if false make it true
        garage.setOpen(!garage.isOpen());
    }


    // 6. isGarageFull
    public boolean isGarageFull(Garage garage) {
        // if free spaces is 0 then is full
        return getFreeSpacesInGarageCount(garage) == 0;
    }

    // 7 and 8. filter electric and non electric cars
    public Car[] filterByElectric(Garage garage, boolean isElectric) {
        // calculate new array size for filtered cars
        int arraySize = 0;
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
            }
            if (car.isElectric() == isElectric) {
                arraySize++;
            }
        }
        Car[] electricCars = new Car[arraySize];
        // add filtered cars to electricCars
        int index = 0;
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
            }
            if (car.isElectric() == isElectric) {
                electricCars[index++] = car;
            }
        }
        return electricCars;
    }


    // 9. Clean garage. Remove all cars and put them back and in between print garage cleaned
    public void cleanGarage(Garage garage) {
        // store cars into temp array
        Car[] cars = garage.getCars();
        // remove cars
        Arrays.fill(garage.getCars(), null);
        int freeSpacesInGarageCount = getFreeSpacesInGarageCount(garage);
        System.out.println("free spaces in garage " + freeSpacesInGarageCount);
        System.out.println("cleaning garage");
        System.out.println("cleaning done");
        System.out.println("put cars back to garage");
        // put them back into garage taking each car from cars
        for (int i = 0; i < garage.getCars().length; i++) {
            garage.getCars()[i] = cars[i];
        }
        System.out.println("free spaces in garage " + freeSpacesInGarageCount);
        System.out.println("all cars in garage");
    }

}
