package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void existWhenAb10Ac10Bc10ThenTrue() {
        double ab = 10.0;
        double ac = 10.0;
        double bc = 10.0;
        assertTrue(Triangle.exist(ab, ac, bc));
    }

    @Test
    public void existWhenAb10Ac10Bc100ThenFalse() {
        double ab = 10.0;
        double ac = 10.0;
        double bc = 100.0;
        assertFalse(Triangle.exist(ab, ac, bc));
    }
}