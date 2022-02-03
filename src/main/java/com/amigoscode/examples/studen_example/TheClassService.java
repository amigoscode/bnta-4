package com.amigoscode.examples.studen_example;

public class TheClassService {

    public void enrol(Student student, TheClass theClass) {
        // check class capacity
        int emptySeat = -1;

        for (int i = 0; i < theClass.getStudents().length; i++) {
            if (theClass.getStudents()[i] == null) {
                emptySeat = i;
            }
            // check if student in class
            if (student.equals(theClass.getStudents()[i])) {
                throw new IllegalStateException("already enrolled");
            }
        }

        if (emptySeat != -1) {
            // add student to class
            theClass.getStudents()[emptySeat] = student;
        }

    }

}
