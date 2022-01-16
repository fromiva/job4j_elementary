package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayWhen1ThenMonday() {
        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen2henTuesday() {
        int day = 2;
        String expected = "Вторник";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen3ThenWednesday() {
        int day = 3;
        String expected = "Среда";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen4ThenThursday() {
        int day = 4;
        String expected = "Четверг";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen5ThenFriday() {
        int day = 5;
        String expected = "Пятница";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen6ThenSaturday() {
        int day = 6;
        String expected = "Суббота";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen7ThenSunday() {
        int day = 7;
        String expected = "Воскресенье";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen0ThenError() {
        int day = 0;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }

    @Test
    public void nameOfDayWhen100ThenError() {
        int day = 100;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(day);
        assertEquals(expected, actual);
    }
}