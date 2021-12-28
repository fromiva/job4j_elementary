package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Than92() {
        short height = 180;
        double expected = 92.0;
        double out = Fit.manWeight(height);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Than69() {
        short height = 170;
        double expected = 69.0;
        double out = Fit.womanWeight(height);
        assertEquals(expected, out, 0.01);
    }
}
