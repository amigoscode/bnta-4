package com.bnta.examples.studen_example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
                1, "Yang", 20
        );

        TheClass theClass = new TheClass(
                "Java",
                20
        );

        System.out.println(Arrays.toString(theClass.getStudents()));
    }
}
