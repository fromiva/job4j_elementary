package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] results = new int[5];
        for (int index = 0; index < results.length; index++) {
            results[index] = index * 2 + 3;
        }
        for (int index = 0; index < results.length; index++) {
            System.out.println(results[index]);
        }
    }
}
