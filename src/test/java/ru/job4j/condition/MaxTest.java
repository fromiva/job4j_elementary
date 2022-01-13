package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4Then4() {
        int left = 3;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertEquals(result, expected);
    }
}