package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Than2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To22Than2Dot83() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;

        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when71To29Than9Dot43() {
        int x1 = 7;
        int y1 = 1;
        int x2 = 2;
        int y2 = 9;

        double expected = 9.43;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1001000To543Than107Dot35() {
        int x1 = 100;
        int y1 = 100;
        int x2 = 54;
        int y2 = 3;

        double expected = 107.35;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, 0.01);
    }
}
