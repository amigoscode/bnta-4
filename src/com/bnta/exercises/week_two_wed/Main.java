package com.bnta.exercises.week_two_wed;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < 10; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
