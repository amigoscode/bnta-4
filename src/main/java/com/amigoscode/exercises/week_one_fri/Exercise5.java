package com.amigoscode.exercises.week_one_fri;

public class Exercise5 {
    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac com.bnta.exercises.week_one_fri.Exercise5.java | java com.bnta.exercises.week_one_fri.Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // loop through args here
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
