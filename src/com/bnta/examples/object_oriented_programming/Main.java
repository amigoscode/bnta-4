package com.bnta.examples.object_oriented_programming;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int usingStatic = add(1, 2);

        Person aaron = new Person(
                "Aaron",
                20,
                SkinColor.BROWN,
                "British"
        );

        Person wendy = new Person(
                "wendy",
                16,
                SkinColor.BLACK,
                "Ghana"
        );

        Address address = new Address(
                "10 bnta street",
                "BNTA",
                "London"
        );

        House house = new House(
                address,
                HouseSize.XL,
                7,
                new Person[]{aaron, wendy}
        );

        System.out.println(house);

        Person wen = new Person(
                "Wendy",
                SkinColor.BLACK
        );
        System.out.println(wen);

        Person will = new Person();
        will.setName("Will");
        will.setSkinColor(SkinColor.WHITE);

        System.out.println("toString........");
        System.out.println(will);

        System.out.println(Person.count);
    }

    private static void example1() {
        String[] foo = {};

        // primitives
        // arrays
        // objects

        String blue = new String("foo");
        Random random = new Random();

        new Person();
        new Person(
                "Wendy",
                16,
                SkinColor.BLACK,
                "Ghana"
        );
        new Person("Michael");

        Person alimaa = new Person(
                "Alimaa",
                15,
                SkinColor.BROWN,
                "Bangladesh");

        System.out.println(alimaa.getName());
        System.out.println(alimaa.getAge());
        System.out.println(alimaa.getSkinColor());

        // .toString or just alimaa is the same thing
        System.out.println(alimaa.toString());
        System.out.println(alimaa);

        Person marcy = new Person();
        marcy.setName("Marcy");
        marcy.setAge(22);
        marcy.setSkinColor(SkinColor.WHITE);

        System.out.println("-------------");
        System.out.println(marcy.getName());
        System.out.println(marcy.getAge());
        System.out.println(marcy.getSkinColor());

        System.out.println(Arrays.toString(new int[]{1}));

        System.out.println(alimaa.equals(marcy));
    }
}
