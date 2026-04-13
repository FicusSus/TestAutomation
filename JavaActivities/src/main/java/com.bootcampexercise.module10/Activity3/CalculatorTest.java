package com.bootcampexercise.module10.Activity3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    // -------- ADD TESTS (4+) --------
    @Test
    void testAddInt1() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testAddInt2() {
        assertEquals(0, calc.add(-2, 2));
    }

    @Test
    void testAddDouble1() {
        assertEquals(5.5, calc.add(2.5, 3.0));
    }

    @Test
    void testAddDouble2() {
        assertEquals(-1.5, calc.add(-2.5, 1.0));
    }

    // -------- SUBTRACT TESTS (2+) --------
    @Test
    void testSubtract1() {
        assertEquals(3, calc.subtract(5, 2));
    }

    @Test
    void testSubtract2() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    // -------- DIVIDE TESTS (2+) --------
    @Test
    void testDivideNormal() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertEquals(0, calc.divide(10, 0)); // handled exception
    }

    // -------- MULTIPLY TESTS (2+) --------
    @Test
    void testMultiplyNormal() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    void testMultiplyNegative() {
        assertEquals(0, calc.multiply(-2, 5)); // exception case
    }
}
