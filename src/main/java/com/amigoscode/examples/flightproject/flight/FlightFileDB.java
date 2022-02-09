package com.amigoscode.examples.flightproject.flight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightFileDB implements FlightDAO {
    private List<Flight> allFlights = new ArrayList<>();

    public FlightFileDB() {

        //String dirName = "src/flight";
        String dirName = "src/";
        //String fileName = "FlightDB.txt";
        String fileName = "FlightDB.txt";

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
                String info = scanner.nextLine();
                int count = 0;
                int index = 0;
                String[] arr1 = info.split("");
                for (int i = 0; i < arr1.length; i++) {
                    if (count == 3) {
                        index = i;
                    }
                    if (arr1[i].equals(",")) {
                        count++;
                    }
                }
                String[] infoPart1 = info.substring(0, index).split(",");
                String[] infoPart2 = info.substring(index + 2).replaceAll("\\[", "").replaceAll("]", "").split(",");

                String[] time = infoPart1[2].split("-");

                int year = Integer.parseInt(time[0]);
                int month = Integer.parseInt(time[1]);
                int day = Integer.parseInt(time[2]);
                int hour = Integer.parseInt(time[3]);
                int minute = Integer.parseInt(time[4]);

                LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute);

                String[] passengers = new String[infoPart2.length];

                for (int i = 0; i < passengers.length; i++) {
                    if (infoPart2[i].trim().equalsIgnoreCase("null")) {
                        passengers[i] = null;
                    } else {
                        passengers[i] = infoPart2[i].trim();
                    }
                }

                Flight flight4 = new Flight(infoPart1[0], Destination.valueOf(infoPart1[1]), localDateTime, Integer.parseInt(infoPart1[3]), passengers);

                allFlights.add(flight4);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage() + ": when attempting to read " + fileName);
        }
    }

    @Override
    public List<Flight> getAllFlights() {
        return allFlights;
    }

    @Override
    public void updateAllFlights(){
        String dirName = "src/";
        String fileName = "FlightDB.txt";

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

            for (Flight f : getAllFlights()) {
                if (f == null) {
                    myWriter.println("Free space.");
                } else {
                    myWriter.println(f.toStringCSV());
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







