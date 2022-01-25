package com.bnta.exercises.week_two_mon.solution;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
        // invoke your function here
        System.out.println(reverse("Wendy"));
        System.out.println(reverse("Sarina"));
    }

    static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
