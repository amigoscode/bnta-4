package com.amigoscode.examples.interfaces.exercise;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonFileDataAccessService();

        PersonService personService = new PersonService(personDAO);
//        personService.savePerson(new Person(3, "Robyn", 20));
//
        System.out.println(1 + 1);
        System.out.println("1" + "1");

        System.out.println(personService.getPeople());
    }
}
