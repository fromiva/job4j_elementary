package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Than2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);

        double expected = 2.0;
        double out = a.distance(b);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To22Than2Dot83() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);

        double expected = 2.83;
        double out = a.distance(b);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when71To29Than9Dot43() {
        Point a = new Point(7, 1);
        Point b = new Point(2, 9);

        double expected = 9.43;
        double out = a.distance(b);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1001000To543Than107Dot35() {
        Point a = new Point(100, 100);
        Point b = new Point(54, 3);

        double expected = 107.35;
        double out = a.distance(b);

        assertEquals(expected, out, 0.01);
    }
}
