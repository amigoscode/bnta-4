package com.amigoscode.examples.object_oriented_programming;

import java.util.Arrays;

public class House {
    private Address address;
    private HouseSize houseSize;
    private int numberOfBedrooms;
    private Person[] people;

    public House(Address address, HouseSize houseSize, int numberOfBedrooms, Person[] person) {
        this.address = address;
        this.houseSize = houseSize;
        this.numberOfBedrooms = numberOfBedrooms;
        this.people = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HouseSize getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(HouseSize houseSize) {
        this.houseSize = houseSize;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "House{" +
                "address=" + address +
                ", houseSize=" + houseSize +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
