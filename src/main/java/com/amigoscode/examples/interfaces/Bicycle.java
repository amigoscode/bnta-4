package com.amigoscode.examples.interfaces;

public class Bicycle implements Vehicle {

    void foo() {}

    @Override
    public void move() {
        System.out.println("pedal");
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }
}
