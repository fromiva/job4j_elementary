package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {

        double distance1 = distance(1, 1, 4, 5);
        System.out.println("result (1, 1) to (4, 5) " + distance1);

        double distance2 = distance(7, 15, -1, 2);
        System.out.println("result (7, 15) to (-1, 2) " + distance2);

        double distance3 = distance(100, 1020, 24, 95);
        System.out.println("result (100, 1020) to (24, 95) " + distance3);
    }

}
