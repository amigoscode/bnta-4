package com.amigoscode.examples.object_oriented_programming;

public class Car {

    private String make;
    private String regNumber;
    private int mileage;

    public Car() {
    }

    public Car(String make, String regNumber, int mileage) {
        this.make = make;
        this.regNumber = regNumber;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
