package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(4, 2));

    }
}