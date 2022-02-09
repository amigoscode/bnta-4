package com.amigoscode.examples.interfaces;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private List<Vehicle> vehicles;

    public Person(String name, List<Vehicle> vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(vehicles, person.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vehicles);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    //    private List<Car> car;
//    private List<Bicycle> bicycles;
//    private List<ElectricScooter> electricScooters;

}
