package com.amigoscode.examples.ds;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParenthesisCheckerTest {

    private ParenthesisChecker underTest = new ParenthesisChecker();

    @Test
    void isBalanced() {
        // Given
        String brackets = "[{{[(){}]}}[]{}{{(())}}]";

        // When
        boolean actual = underTest.isBalanced(brackets);

        // Then
        assertThat(actual).isTrue();
    }
}