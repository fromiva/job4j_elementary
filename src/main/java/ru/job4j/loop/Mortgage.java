package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double fraction = percent / 100.0 + 1.0;
        while (amount > 0.0) {
            amount = amount * fraction - salary;
            year++;
        }
        return year;
    }
}
