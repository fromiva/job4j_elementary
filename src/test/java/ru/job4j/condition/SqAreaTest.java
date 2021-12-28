package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6.0;
        double k = 2.0;

        double expected = 2.0;
        double out = SqArea.square(p, k);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1Square1() {
        double p = 4.0;
        double k = 1.0;

        double expected = 1.0;
        double out = SqArea.square(p, k);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K4Square16() {
        double p = 20.0;
        double k = 4.0;

        double expected = 16.0;
        double out = SqArea.square(p, k);

        assertEquals(expected, out, 0.01);
    }
}
