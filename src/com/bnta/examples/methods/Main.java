package com.bnta.examples.methods;

public class Main {
    public static void main(String[] args) {
//        System.out.println(capitalize("Michael"));
//        System.out.println(numLength("Michael"));
//        System.out.println(capitalize("Abdi"));
//        System.out.println(capitalize("Linda"));
//        display("Linda");

        String[] names = {"Michael", "Linda", "Sarina"};
        String [] result = capitalizeStrings(names);
        for(String r : result) {
            System.out.println(r);
        }
    }

    static private String[] capitalizeStrings(String[] strings) {
        String[] capitals = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            capitals[0] = strings[i].toUpperCase();
        }
        return capitals;
    }

    static public String capitalize(String foo) {
        return foo.toUpperCase();
    }

    static public int numLength(String foo) {
        return foo.length();
    }

    static public void display(String foo) {
        System.out.println("------------------");
        System.out.println(foo.toUpperCase());
        System.out.println(foo.length());
        System.out.println("------------------");
    }

}
