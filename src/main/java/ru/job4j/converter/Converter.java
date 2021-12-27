package ru.job4j.converter;

public class Converter {

    public static float roubleToEuro(float value) {
        return value / 70;
    }

    public static float roubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {

        float roubles;

        roubles = 140.0F;
        float euro = Converter.roubleToEuro(roubles);
        System.out.println(roubles + " roubles are " + euro + " euros.");

        roubles = 180.0F;
        float dollar = Converter.roubleToDollar(roubles);
        System.out.println(roubles + " roubles are " + dollar + " dollars");
    }
}
