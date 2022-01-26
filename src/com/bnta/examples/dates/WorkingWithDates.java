package com.bnta.examples.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class WorkingWithDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());


        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println("--------");

        LocalDate d = LocalDate.of(2001, Month.JANUARY, 1);
        LocalDate d2 = LocalDate.of(2000, Month.JANUARY, 2);
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

        System.out.println(d.isLeapYear());

        System.out.println("---------");
        LocalDate dob = LocalDate.of(2001, Month.JANUARY, 1);
        LocalDate dobPlus3dWeeks = dob.plusWeeks(30);

        System.out.println(dob);
        System.out.println(dobPlus3dWeeks);

    }
}














