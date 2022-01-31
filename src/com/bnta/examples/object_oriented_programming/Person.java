package com.bnta.examples.object_oriented_programming;

public class Person {

    static int count = 0;

    private String name;
    private int age;
    private SkinColor skinColor;
    private String nationality;

    Person() {
        count++;
    }

    Person(String name,
                  int age,
                  SkinColor skinColor,
                  String nationality) {
        this.name = name;
        this.age = age;
        this.skinColor = skinColor;
        this.nationality = nationality;
        count++;
    }

    public Person(SkinColor skinColor) {
        this.age = 0;
        this.skinColor = skinColor;
        count++;
    }

    public Person(String name,
                  SkinColor skinColor) {
        this.name = name;
        this.age = 0;
        this.skinColor = skinColor;
        count++;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SkinColor getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skinColor=" + skinColor +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
