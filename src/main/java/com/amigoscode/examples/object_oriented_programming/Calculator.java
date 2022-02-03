package com.amigoscode.examples.object_oriented_programming;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            throw new IllegalArgumentException("cannot divide by 0");
        }
        return a / b;
    }
}
