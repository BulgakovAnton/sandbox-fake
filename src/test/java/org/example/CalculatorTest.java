package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void addNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void addMixedNumbers() {
        assertEquals(1, calculator.add(4, -3));
    }

    @Test
    void subtractPositiveNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void subtractToNegativeResult() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void multiplyPositiveNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void multiplyByZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void dividePositiveNumbers() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void divideShouldThrowOnZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void evenNumberShouldReturnTrue() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    void oddNumberShouldReturnFalse() {
        assertFalse(calculator.isEven(5));
    }

    @Test
    void maxShouldReturnFirst() {
        assertEquals(10, calculator.max(10, 3));
    }
}