package com.amigoscode.exercises.week_one_fri;

public class Exercise2 {
    public static void main(String[] args) {
        /*  Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */
        String name = "linda";
        String surname = "linda";
        // WRONG boolean result = name. == surname;
        boolean result = name.equals(surname);
        System.out.println(result);
    }
}
