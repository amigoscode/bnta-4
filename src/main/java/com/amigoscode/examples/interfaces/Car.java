package com.amigoscode.examples.interfaces;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("start engine");
        System.out.println("gear");
        System.out.println("accelerate");
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }
}
