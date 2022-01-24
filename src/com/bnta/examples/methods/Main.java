package com.bnta.examples.methods;

public class Main {
    public static void main(String[] args) {
        String result = printLength( 17);
        System.out.println(result);
    }

    static String printLength(int age) {
        if (age < 16) {
            return "still a child";
        } else {
            return "hooray adult :)";
        }
    }

//    static void printLength(String name, int age) {
//        int length = name.length();
//        System.out.println(name + " -> " + length);
//        if (age < 16) {
//            System.out.println("still a child");
//        } else {
//            System.out.println("hooray adult :)");
//        }
//    }

//    static void printLength() {
//        String name = "Alex";
//        int length = name.length();
//        System.out.println(name + " -> " + length);
//    }
}
