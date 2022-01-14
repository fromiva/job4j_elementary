package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void isEvenWhen10ThanTrue() {
        int when = 10;
        boolean expected = true;
        boolean actual = LogicNot.isEven(when);
        assertEquals(expected, actual);
    }

    @Test
    public void isEvenWhenMinus3ThanFalse() {
        int when = -3;
        boolean expected = false;
        boolean actual = LogicNot.isEven(when);
        assertEquals(expected, actual);
    }

    @Test
    public void isPositiveWhen10ThanTrue() {
        int when = 10;
        boolean expected = true;
        boolean actual = LogicNot.isPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void isPositiveWhenMinus3ThanFalse() {
        int when = -3;
        boolean expected = false;
        boolean actual = LogicNot.isPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notEvenWhen10ThanFalse() {
        int when = 10;
        boolean expected = false;
        boolean actual = LogicNot.notEven(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notEvenWhenMinus3ThanTrue() {
        int when = -3;
        boolean expected = true;
        boolean actual = LogicNot.notEven(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notPositiveWhen10ThanFalse() {
        int when = 10;
        boolean expected = false;
        boolean actual = LogicNot.notPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notPositiveWhenMinus3ThanTrue() {
        int when = -3;
        boolean expected = true;
        boolean actual = LogicNot.notPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notEvenAndPositiveWhen10ThanFalse() {
        int when = 10;
        boolean expected = false;
        boolean actual = LogicNot.notEvenAndPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notEvenAndPositiveWhen11ThanTrue() {
        int when = 11;
        boolean expected = true;
        boolean actual = LogicNot.notEvenAndPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notEvenAndPositiveWhen3ThanTrue() {
        int when = 3;
        boolean expected = true;
        boolean actual = LogicNot.notEvenAndPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void notEvenAndPositiveWhenMinus3ThanFalse() {
        int when = -3;
        boolean expected = false;
        boolean actual = LogicNot.notEvenAndPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrNotPositiveWhen10ThanTrue() {
        int when = 10;
        boolean expected = true;
        boolean actual = LogicNot.evenOrNotPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrNotPositiveWhen11ThanFalse() {
        int when = 11;
        boolean expected = false;
        boolean actual = LogicNot.evenOrNotPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrNotPositiveWhenMinus10ThanTrue() {
        int when = -10;
        boolean expected = true;
        boolean actual = LogicNot.evenOrNotPositive(when);
        assertEquals(expected, actual);
    }

    @Test
    public void evenOrNotPositiveWhenMinus11ThanTrue() {
        int when = -11;
        boolean expected = true;
        boolean actual = LogicNot.evenOrNotPositive(when);
        assertEquals(expected, actual);
    }
}