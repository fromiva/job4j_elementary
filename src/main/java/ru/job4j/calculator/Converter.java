package ru.job4j.calculator;

public class Converter {

    public static float roubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float roubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.roubleToEuro(140);
        System.out.println("140 roubles are " + euro + " euros.");

        float dollar = Converter.roubleToDollar(140);
        System.out.println("140 roubles" + dollar + " dollars");
    }
}
