package com.amigoscode.examples.object_oriented_programming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        int n1 = 10;
        int n2 = 10;

        // When
        int actual = calculator.add(n1, n2);

        // Then
        int expected = 20;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canDivideTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        int n1 = 10;
        int n2 = 10;

        // When
        int actual = calculator.divide(n1, n2);

        // Then
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void throwsExceptionWhenDividingByZero() {
        // Given
        Calculator calculator = new Calculator();
        int n1 = 10;
        int n2 = 0;

        // Then
        assertThatThrownBy(() -> {
            // When
            calculator.divide(n1, n2);
        }).hasMessage("cannot divide by 0");

    }
}