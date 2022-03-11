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

    @Test
    public void whenMax1and2and3then3() {
        int first = 1;
        int second = 2;
        int third = 3;

        int expected = 3;
        int actual = Max.max(first, second, third);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMax3and2and1then3() {
        int first = 3;
        int second = 2;
        int third = 1;

        int expected = 3;
        int actual = Max.max(first, second, third);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMax1and5and3then5() {
        int first = 1;
        int second = 5;
        int third = 3;

        int expected = 5;
        int actual = Max.max(first, second, third);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMax1and2and3and4then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;

        int expected = 4;
        int actual = Max.max(first, second, third, fourth);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMax5and2and3and4then5() {
        int first = 5;
        int second = 2;
        int third = 3;
        int fourth = 4;

        int expected = 5;
        int actual = Max.max(first, second, third, fourth);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMax1and6and3and4then6() {
        int first = 1;
        int second = 6;
        int third = 3;
        int fourth = 4;

        int expected = 6;
        int actual = Max.max(first, second, third, fourth);
        assertEquals(expected, actual);
    }

    @Test
    public void whenMax1and2and7and4then7() {
        int first = 1;
        int second = 2;
        int third = 7;
        int fourth = 4;

        int expected = 7;
        int actual = Max.max(first, second, third, fourth);
        assertEquals(expected, actual);
    }
}