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

        float in;
        float expected;
        float out;
        boolean passed;

        roubles = 140.0F;
        float euro = Converter.roubleToEuro(roubles);
        System.out.println(roubles + " roubles are " + euro + " euros.");

        in = 140.0F;
        expected = 2.0F;
        out = Converter.roubleToEuro(in);
        passed = expected == out;
        System.out.println("Test result for 'roubleToEuro': " + passed);

        roubles = 180.0F;
        float dollar = Converter.roubleToDollar(roubles);
        System.out.println(roubles + " roubles are " + dollar + " dollars");

        in = 180.0F;
        expected = 3.0F;
        out = Converter.roubleToDollar(in);
        passed = expected == out;
        System.out.println("Test result for 'roubleToDollar': " + passed);
    }
}
