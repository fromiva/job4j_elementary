package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort34125() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort98765() {
        int[] data = new int[] {9, 8, 7, 6, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort123() {
        int[] data = new int[] {1, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        assertArrayEquals(expected, result);
    }
}