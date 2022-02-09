package com.amigoscode.examples.flightproject.util;

import com.amigoscode.examples.flightproject.passenger.Passenger;

import java.util.List;
import java.util.Random;

public class IdGenerator {


    public String randomIdGenerator(List<Passenger> p){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        Random random = new Random();
        String randomString = "";
        boolean duplicate = false;


        do {
            duplicate = false;
            randomString = "";
            for (int i = 0; i < 7; i++) {
                randomString += characters.charAt(random.nextInt(characters.length()));
            }

            for (Passenger passenger : p) {
                if (randomString.equalsIgnoreCase(passenger.getId())) {
                    duplicate = true;
                    break;
                }
            }
        } while (duplicate);

        // if it matches an existing id, randomIdGenerator().
        return randomString;
    }
}
