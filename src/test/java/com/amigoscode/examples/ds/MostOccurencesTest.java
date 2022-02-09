package com.amigoscode.examples.ds;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MostOccurencesTest {

    @Test
    void name() {
        // Given
        String input = "A,3,4,4,A,A";

        // When
        MostOccurences mostOccurences = new MostOccurences();
        HashMap<String, Integer> actual =
                mostOccurences.check(input);

        // Then
        Map<String, Integer> expected = Map.of(

                "A", 3,
                "3", 1,
                "4", 2
        );
        assertThat(actual).isEqualTo(expected);

        int max = 0;
        expected.forEach((k, v) -> {
            System.out.println(k + " -> " + v);

        });
    }
}