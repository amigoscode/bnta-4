package com.amigoscode.examples.flightproject.passenger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerDao {
    private List<Passenger> allPassengers = new ArrayList<>();

    public PassengerDao() {

        // String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/Flight_Project/src/passenger";
        String dirName = "src/";
        String fileName = "PassengerDB.txt";

        File file = new File(dirName, fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Empty DB created!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] info = scanner.nextLine().split(",");
                Passenger passenger = new Passenger(info[0], info[1], info[2], info[3], info[4]);
                allPassengers.add(passenger);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": when attempting to read " + fileName);
        }
    }

    public List<Passenger> getAllPassengers() {
        return allPassengers;
    }

    public void updateAllPassengers() {
        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/Flight_Project/src/main/java/passenger";
        String fileName = "PassengerDB.txt";

        File file = new File(dirName, fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Empty DB created!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // create fileWriter with our txt file as an argument
            FileWriter fileWriter = new FileWriter(file);
            // create printWriter with fileWriter as argument
            PrintWriter myWriter = new PrintWriter(fileWriter);

            for (Passenger p : getAllPassengers()) {
                if (p == null) {
                    myWriter.println("Free space.");
                } else {
                    myWriter.println(p.toStringCSV());
                }
            }
            // end of writing
            myWriter.flush();
            myWriter.close();

        } catch (Exception e) {
            System.out.println("Couldn't write to file.");
        }
    }
}
