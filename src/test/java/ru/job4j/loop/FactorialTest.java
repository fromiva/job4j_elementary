package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredAndTwenty() {
        int when = 5;
        int expected = 120;
        int actual = Factorial.calc(when);
        assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int when = 0;
        int expected = 1;
        int actual = Factorial.calc(when);
        assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int when = 1;
        int expected = 1;
        int actual = Factorial.calc(when);
        assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForTwoThenTwo() {
        int when = 2;
        int expected = 2;
        int actual = Factorial.calc(when);
        assertEquals(expected, actual);
    }
}