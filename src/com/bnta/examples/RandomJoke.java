package com.bnta.examples;

import java.util.Random;

public class RandomJoke {
    public static void main(String[] args) {

        String[] jokes = {
                "Alex", // index 0
                "Colin", // index 1
                "Abdi", // index 2
                "Marcy", // index 3
                "Suraaj", // index 4
                "Robyn", // index 5,
                "Yang", // index 6,
                "Hajr", // index 7,
                "Bob", // index 8,

        };

        Random random = new Random();

        // Random number between 0 - 9
        int randomNumber = random.nextInt(jokes.length);

        System.out.println(jokes[randomNumber]);


    }

}
