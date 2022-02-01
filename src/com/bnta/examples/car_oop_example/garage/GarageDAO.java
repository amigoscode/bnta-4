package com.bnta.examples.car_oop_example.garage;

import com.bnta.examples.car_oop_example.car.Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GarageDAO {

    // 10. Create GarageDAO class and store current cars in garage to a file
    public void saveToFile(Garage garage, String pathname) {
        try {
            File file = new File(pathname);
            if (file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Car car : garage.getCars()) {
                printWriter.println(car.getMake() + "," + car.getRegNumber() + "," + car.isElectric());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 11. Create a second method to read cars from a file
    public Car[] readCarsFromFile(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                throw new IllegalStateException("File " + filename + " does not exist");
            }

            // calculate number of lines in file. i.e number of cars
            int numberOfCars = 0;
            Scanner scannerForLinesCount = new Scanner(file);
            while (scannerForLinesCount.hasNext()) {
                scannerForLinesCount.nextLine();
                numberOfCars++;
            }

            // create new array based on numberOfCars size
            Car[] cars = new Car[numberOfCars];

            // loop through file with scanner
            Scanner scanner = new Scanner(file);

            int index = 0;

            while (scanner.hasNext()) {
                // get the line
                String line = scanner.nextLine();
                // split by comma. i.e Honda,1234,false
                // array
                    // [0] - Honda
                    // [1] - 1234
                    // [2] - false
                String[] split = line.split(",");
                // Construct car from array
                Car car = new Car(split[0], split[1], Boolean.parseBoolean(split[2]));
                // add car and increment index
                cars[index++] = car;
            }
            return cars;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // otherwise, return empty array
        return new Car[0];
    }
}
