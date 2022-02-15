package com.amigoscode.examples.interfaces.exercise;

import java.util.ArrayList;
import java.util.List;

public class PersonListDataAccessService implements PersonDAO {

    private List<Person> db;

    public PersonListDataAccessService() {
        db = new ArrayList<>();
    }

    @Override
    public void savePerson(Person person) {
        db.add(person);
    }

    @Override
    public void deletePerson(int id) {
        for (int i = 0; i < db.size(); i++) {
            Person person = db.get(i);
            if (person.getId() == id) {
                db.remove(i);
            }
        }
    }

    @Override
    public List<Person> getPeople() {
        return db;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
