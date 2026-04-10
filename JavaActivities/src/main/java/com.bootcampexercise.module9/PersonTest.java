package com.bootcampexercise.module9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @AfterEach
    void tearDown() {
        person = null;
    }

    @Test
    void testSetAndGetWeight() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    @Test
    void testSetAndGetHeight() {
        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight(), 0.0001);
    }

    @Test
    void testBMIValid() {
        String result = person.calculateBMI(1.8f, 80);
        assertTrue(result.contains("BMI is:"));
    }

    @Test
    void testBMIInvalidHeight() {
        String result = person.calculateBMI(0f, 70);
        assertEquals("Invalid values: height and weight must be greater than 0.", result);
    }

    @Test
    void testBMIInvalidWeight() {
        String result = person.calculateBMI(1.7f, 0);
        assertEquals("Invalid values: height and weight must be greater than 0.", result);
    }

    @Test
    void testBMITooLargeHeight() {
        String result = person.calculateBMI(4.0f, 70);
        assertEquals("Invalid height: value too high.", result);
    }

    @Test
    void testBMITooLargeWeight() {
        String result = person.calculateBMI(1.7f, 600);
        assertEquals("Invalid weight: value too high.", result);
    }
}