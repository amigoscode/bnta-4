package com.bnta.examples.car_oop_example;

public class GarageService {
    // This class performs all business logic for the following:
    // 1. add cars
    // 2. how many cars in the garage
    // 2. number of free spots in garage
    // 3. remove car
    // 4. Open and close garage
    // 5. isGarageFull
    // 6. filter electric cars
    // 7. filter non electric cars
    // 6. Clean garage

    public void addCar(Garage garage, Car car) {
        // check if open
            // if open check not full
                // then add car to garage
            // if full throw exception
        // if not open throw exception
        if (garage.isOpen()) {
            int currentCarsInGarageCount = getTotalNumberOfCarsInGarage(garage);
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

    public int getTotalNumberOfCarsInGarage(Garage garage) {
        int currentCarsInGarageCount = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                currentCarsInGarageCount++;
            }
        }
        return currentCarsInGarageCount;
    }


}
