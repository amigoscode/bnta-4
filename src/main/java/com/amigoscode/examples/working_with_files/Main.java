package com.amigoscode.examples.working_with_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/hello.txt");
        try {

            if (!file.exists()) {

                file.createNewFile();

            }

            // Allows to write to file. True will append contents at the end.
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Now lets write
            printWriter.println("Yang");
            printWriter.println("Linda");

            for (int i = 0; i < 1_000; i++) {
                printWriter.println(i);
            }

            // once you are done writing to the file
            printWriter.flush();
            printWriter.close();

            // Read from file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine().toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
