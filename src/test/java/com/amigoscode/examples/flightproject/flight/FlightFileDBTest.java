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

        Map<Integer, Integer> map = new HashMap<>();


        List<Integer> integers = List.of(1, 2, 1, 3);

        for (Integer i : integers) {

            Integer val = map.get(i);

            map.put(i, val == null ? 1 : val + 1);

        }

    }
}