package com.amigoscode.examples.studen_example;

import java.util.Arrays;
import java.util.Objects;

public class TheClass {
    private String className;
    private int capacity;
    private Student[] students;

    public TheClass(String className, int capacity) {
        this.className = className;
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "TheClass{" +
                "className='" + className + '\'' +
                ", capacity=" + capacity +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheClass theClass = (TheClass) o;
        return capacity == theClass.capacity && Objects.equals(className, theClass.className) && Arrays.equals(students, theClass.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(className, capacity);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }
}
