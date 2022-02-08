package com.amigoscode.examples.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class WorkingWithArrayLists {

    static class Person {
        String getFoo() {
            return "bar";
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Person());
        people.clear();

    }

    private static void extracted2() {
        ArrayList<Person> list = new ArrayList<>();
//        list.add(1);
//        list.add("2");
        list.add(new Person());
//        list.add(3.14);
        for (Person person : list) {
            System.out.println(person.getFoo());
        }

        // add this to textbook
//        ArrayList<long> numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add(null);
    }

    private static void extracted1() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("2");
        list.add(new Person());
        list.add(3.14);

        for (Object e : list) {
            if (e instanceof Person) {
                Person person = (Person) e;
                System.out.println(person.getFoo());
            }
            if (e instanceof String) {

            }

            if (e instanceof Double) {

            }

        }
    }

    private static void extracted() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.indexOf(1));
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        // add back again

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(e -> {
            System.out.println("e = " + e);
        });

        for (Object e : list) {
            System.out.println("e = " + e);
        }

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list[i]);
            System.out.println(list.get(i));
        }
    }
}
