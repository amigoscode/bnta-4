package com.amigoscode.examples.enums;

public class Main {

    public static int YANG = 10;

    public static void main(String[] args) {

        System.out.println(Color.BLACK);
        System.out.println(WeatherSeason.SUMMER);

        String[] names = {};


        ShoeSize[] shoeSizes = ShoeSize.values();
        for (ShoeSize shoeSize : shoeSizes) {
            System.out.println(shoeSize.name().toLowerCase());
        }

        System.out.println(WeatherSeason.SUMMER.equals(WeatherSeason.WINTER));
        WeatherSeason.valueOf("SUMMER");
        WeatherSeason[] weatherSeasons = WeatherSeason.values();
    }
}
