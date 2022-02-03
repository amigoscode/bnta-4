package com.amigoscode;

import com.github.javafaker.Faker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.book().title());
        System.out.println(faker.superhero().name());
        System.out.println(faker.superhero().power());
    }
}
