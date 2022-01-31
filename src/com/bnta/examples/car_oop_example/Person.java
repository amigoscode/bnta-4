package com.bnta.examples.car_oop_example;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String email;
    private Car[] cars;

    public Person(String name, int age, String email, Car[] cars) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
