package com.amigoscode.examples.car_oop_example.garage;

import com.amigoscode.examples.car_oop_example.Person;
import com.amigoscode.examples.car_oop_example.car.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class GarageServiceTest {

    @Test
    void canAddCarToGarageWithOneSpaceLeft() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car[] cars = {car};
        Person connie = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(connie, 10, 2);

        // When
        garageService.openOrGarage(garage);
        garageService.addCar(garage, car);

        // Then
        assertThat(garage.getCars()).contains(car);
        assertThat(garage.getCars()).containsNull();
    }

    @Test
    void canAddCarToGarageWith0SpacesLeft() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car tesla = new Car("Tesla", "1234", false);
        Car[] cars = {car, tesla};
        Person connie = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(connie, 10, 2);

        // When
        garageService.openOrGarage(garage);
        garageService.addCar(garage, car);
        garageService.addCar(garage, tesla);

        // Then
        assertThat(garage.getCars()).containsExactly(car, tesla);
    }

    @Test
    void cannotAddCarToGarageWhenFull() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car tesla = new Car("Tesla", "1234", false);
        Car fiat = new Car("Fiat", "1234", false);
        Car[] cars = {car, tesla};
        Person connie = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(connie, 10, 2);

        // When
        garageService.openOrGarage(garage);
        garageService.addCar(garage, car);
        garageService.addCar(garage, tesla);
        assertThatThrownBy(() -> {
            garageService.addCar(garage, fiat);
        }).hasMessage(garage.getGarageNumber() + " is full. Sorry :(");

        // Then
        assertThat(garage.getCars()).containsExactly(car, tesla);
    }

    @Test
    void cannotAddCarToGarageIfNotOpen() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car[] cars = {car};
        Person connie = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(connie, 10, 2);

        // When
        assertThatThrownBy(() -> {
            garageService.addCar(garage, car);
        }).hasMessage(garage.getGarageNumber() + " is closed. Please open before adding your car");


        // Then
        assertThat(garage.getCars()).containsOnlyNulls();
    }


    @Test
    void canCountNumberOfCarsInGarage() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car[] cars = {car};
        Person connie = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(connie, 10, 2);
        garageService.openOrGarage(garage);
        garageService.addCar(garage, car);

        // When
        int actual = garageService.getCurrentCarsInGarageCount(garage);

        // Then
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCountNumberOfCarsInGarageWhenEmpty() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car[] cars = {car};
        Person connie = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(connie, 10, 2);
        garageService.openOrGarage(garage);

        // When
        int actual = garageService.getCurrentCarsInGarageCount(garage);

        // Then
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getFreeSpacesInGarageCount() {
        // Given

        // When

        // Then
    }

    @Test
    void removeCar() {
        // Given

        // When

        // Then
    }

    @Test
    void openOrGarage() {
        // Given

        // When

        // Then
    }

    @Test
    void isGarageFull() {
        // Given

        // When

        // Then
    }

    @Test
    void filterByElectric() {
        // Given

        // When

        // Then
    }

    @Test
    void cleanGarage() {
        // Given

        // When

        // Then
    }
}