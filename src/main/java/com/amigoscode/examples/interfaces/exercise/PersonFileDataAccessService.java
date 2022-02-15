package com.amigoscode.examples.interfaces.exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonFileDataAccessService implements PersonDAO {

    @Override
    public void savePerson(Person person) {
        try {
            File file = new File("src/person.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(person.getId() + "," + person.getName() + "," + person.getAge());

            // once you are done writing to the file
            printWriter.flush();
            printWriter.close();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public List<Person> getPeople() {
        File file = new File("src/person.txt");
        if (!file.exists()) {
            return List.of();
        }

        List<Person> people = new ArrayList<>();

        try {
            // read example
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] split = scanner.nextLine().split(",");
                Person person = new Person(
                        Integer.parseInt(split[0]),
                        split[1],
                        Integer.parseInt(split[2])
                );
                people.add(person);
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        return people;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
