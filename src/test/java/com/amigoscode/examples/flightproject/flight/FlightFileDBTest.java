package com.amigoscode.examples.flightproject.flight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FlightFileDBTest {

    @Test
    void name() {
        // Given
        FlightFileDB flightFileDB = new FlightFileDB();

        // When
        List<Flight> allFlights = flightFileDB.getAllFlights();

        // Then
        assertThat(allFlights).isEmpty();


        Map<String, Integer> map = new HashMap<>();

        map.put("foo", 1);


        int count = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey());
            Integer value = e.getValue();
            boolean b = value > 0;
            System.out.println(value);
        }
    }
}