package com.bnta.examples.exceptions;

public class ErrorHandling {
    public static void main(String[] args) {
//        example1();

        int[] numbers = {1, 2, 3, 0, 4, 5};
        int result = 0;
        for (int number : numbers) {
            int add = (number + 100) / number;
            result+= add;
        }
        System.out.println(result);
    }

    private static void example1() {
        try {
            int division = 10 / 1;
            int result = Integer.parseInt("10x");
            System.out.println(result);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("oops input not a number");
        } catch (ArithmeticException e) {
            System.out.println("oops cant divide by 0");
        }catch (Exception e) {
            System.out.println("catch all");
            System.out.println(e);
        }

        System.out.println("Sarina :)");
    }
}
