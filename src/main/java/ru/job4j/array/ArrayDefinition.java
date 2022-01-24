package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Константин Лаврентьев";
        names[1] = "Валерий Макаров";
        names[2] = "Роман Евдокимов";
        names[3] = "Глеб Юрский";

        System.out.println("Размер массива 'ages' равен: " + ages.length);
        System.out.println("Размер массива 'surnames' равен: " + surnames.length);
        System.out.println("Размер массива 'prices' равен: " + prices.length);

        System.out.println();
        System.out.println("Массив 'names' - ячейка №0: " + names[0]);
        System.out.println("Массив 'names' - ячейка №1: " + names[1]);
        System.out.println("Массив 'names' - ячейка №2: " + names[2]);
        System.out.println("Массив 'names' - ячейка №3: " + names[3]);
    }
}
