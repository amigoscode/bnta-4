package com.amigoscode.examples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean showMore = true;

        while (showMore) {
            Scanner scanner = new Scanner(System.in);

            printMenu();

            int option = scanner.nextInt();

            if (option == 1) {
                programOne(scanner);
            } else if (option == 2) {
                programTwo(scanner);
            } else if (option == -1) {
                showMore = false;
            } else {
                System.out.println("Unknown option");
            }
        }

    }

    private static void printMenu() {
        System.out.println("Choose program");
        System.out.println("- Option 1 - Add numbers");
        System.out.println("- Option 2 - Convert int to month");
        System.out.println("- Option -1 - To Exit program");
    }

    private static void programTwo(Scanner scanner) {
        System.out.println("Enter month to convert: Range = 1...12");
        int month = scanner.nextInt();
        System.out.println(convertNumberToMonth(month));
    }

    private static void programOne(Scanner scanner) {
        printQuestionOne();
        int number1 = scanner.nextInt();
        printQuestionTwo();
        int number2 = scanner.nextInt();
        int result = add(number1, number2);
        printAnswer(number1, number2, result);
    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void printQuestionOne() {
        System.out.println("Enter first number: ");
    }

    public static void printQuestionTwo() {
        System.out.println("Enter second number: ");
    }

    public static void printAnswer(int n1, int n2, int result) {
        System.out.println("------Addition-------");
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.println("have a good day");
    }

    public static String convertNumberToMonth(int month) {
        switch (month) {
            case 1:
                return "JANUARY";
            case 2:
                return "FEB";
            case 3:
                return "MARCH";

            default:
                return month + " NOT VALID MONTH";
        }
    }
}
