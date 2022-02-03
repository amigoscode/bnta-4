package com.amigoscode.examples.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorHandling {
    public static void main(String[] args) {


            extracted(new int[]{1, 2, 0, 5});
            extracted(new int[]{1, 2, 2, 5});
            extracted(new int[]{});
            extracted(new int[]{0, 0, 0, 0});

    }

    private static void extracted(int[] numbers) {
        for (int number : numbers) {
            if (number == 0) {
                throw new RuntimeException("sorry but I dont accept 0");
            }
            System.out.println(10 / number);
        }
    }

    private static FileInputStream michelle() throws FileNotFoundException {
        FileInputStream fileInputStream = sarina();
        return fileInputStream;
    }

    private static FileInputStream michael() throws FileNotFoundException {
        FileInputStream fileInputStream = michelle();
        return fileInputStream;
    }

    private static void yang() {
        try {
            FileInputStream fileInputStream = michael();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static FileInputStream sarina() throws FileNotFoundException {
        File file = new File("./foo.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        return fileInputStream;
    }

    private static void example4() {
        // checked exceptions
        File file = new File("./foo.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        }

        // unchecked
        for (int i = 10; i > -1; i--) {
            System.out.println(10 / i);
        }
        int result = Integer.parseInt("1");
    }

    private static void example3() {
        String number = "10x";

        try {
            int result = Integer.parseInt(number);
            System.out.println("foobar");
            //
            //
            //

        } catch (NumberFormatException e) {
            System.out.println("oops failed parse " + number);
        }
        System.out.println("foo");
    }

    private static void example2() {
        int[] numbers = {1, 2, 3, 0, 4, 5};
        int result = 0;
        for (int number : numbers) {
            int add = (number + 100) / number;
            result += add;
        }
        System.out.println(result);
    }

    private static void example1() {
        try {
            int division = 10 / 1;
            int result = Integer.parseInt("10");
            // dodgy error
            System.out.println(result);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("oops input not a number");
        } catch (ArithmeticException e) {
            System.out.println("oops cant divide by 0");
        } catch (Exception e) {
            System.out.println("catch all");
            System.out.println(e);
        }

        System.out.println("Sarina :)");
    }
}
