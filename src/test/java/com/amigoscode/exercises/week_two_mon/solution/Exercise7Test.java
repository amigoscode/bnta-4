package com.amigoscode.exercises.week_two_mon.solution;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Exercise7Test {

    private Exercise7 underTest;

    @BeforeEach
    void setUp() {
        underTest = new Exercise7();
    }

    @Test
    void itCanReturnLongestString() {
        // Given
        String[] input = {"Robyn", "Alex", "Michelle", "Adib"};

        // When
        String actual = underTest.longestWords(input);

        // Then
        String expected = "Michelle";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itCanReturnLongestStringWhenDuplicates() {
        // Given
        String[] input = {"Robyn", "Alex", "Michelle", "Michelle", "Adib"};

        // When
        String actual = underTest.longestWords(input);

        // Then
        String expected = "Michelle";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itCanReturnTwoLongestString() {
        // Given
        String[] input = {"Robyn", "Alex", "Michelle", "Michella", "Adib"};

        // When
        String actual = underTest.longestWords(input);

        // Then
        String expected = "Michelle, Michella";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleNull() {
        // Given
        String[] input = null;

        // When
        String actual = underTest.longestWords(input);

        // Then
        String expected = "";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleAllEmptyStringsAsInput() {
        // Given
        String[] input = {"", "", "", "", ""};

        // When
        String actual = underTest.longestWords(input);

        // Then
        String expected = "";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleEmptyInput() {
        // Given
        String[] input = {};

        // When
        String actual = underTest.longestWords(input);

        // Then
        String expected = "";
        assertThat(actual).isEqualTo(expected);
    }
}