package com.amigoscode.examples.ds;

import java.util.*;

public class WorkingWithArrayLists {

    static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        String getFoo() {
            return "bar";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        System.out.println("1" + "1");
        System.out.println(1 + 1);


        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("Robyn"), "Fast and F");
        map.put(new Person("Robyn"), "Frozen");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get(new Person("Robyn")));
        System.out.println(new Person("Alex").hashCode());
        System.out.println(new Person("Alex").hashCode());
        System.out.println(new Person("Alex").hashCode());
        System.out.println(new Person("Alex").hashCode());
        System.out.println(new Person("Alex").hashCode());


    }

    private static void maps() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Sarina");
        map.put(2, "Aaron");
        map.put(3, "Rachel");
        map.put(4, "Abdi");
        System.out.println(map);
        String s = map.get(1);
        System.out.println(s);
        System.out.println(map.keySet());
        System.out.println(map.get(10));
        System.out.println(map.getOrDefault(10, "Darshil"));
    }

    private static void stacks() {
        Stack<String> stack = new Stack<>();
        stack.push("Alimaa");
        stack.push("Cristian");
        stack.push("Rachel");
        stack.push("Linda");
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    private static void extracted2() {
        List<Person> list = new ArrayList<>();
//        list.add(1);
//        list.add("2");
        list.add(new Person("name"));
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
        list.add(new Person("name"));
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
        List list = new ArrayList();
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
