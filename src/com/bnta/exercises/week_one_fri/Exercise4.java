package com.bnta.exercises.week_one_fri;

public class Exercise4 {
    public static void main(String[] args) {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] inputArray = input.split(", ");

        double result = 0;

        for (int i = 0; i < inputArray.length; i++) {
            String number = inputArray[i];
            double numberDbl = Double.parseDouble(number);
            result = result + numberDbl;
            System.out.println(result);
        }

    }
}
