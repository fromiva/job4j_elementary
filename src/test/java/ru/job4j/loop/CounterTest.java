package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFromOneToTenThenSeventyFive() {
        int start = 10;
        int finish = 15;
        int result = Counter.sum(start, finish);
        int expected = 75;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenFromTenToFifteenThenThirtySix() {
        int start = 10;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertEquals(expected, result);
    }
}