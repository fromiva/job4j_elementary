package ru.job4j.converter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euros() {
        float in = 140.0F;
        float expected = 2.0F;
        float eps = 0.0001F;
        float out = Converter.roubleToEuro(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert174RblThen2Dot48572Euros() {
        float in = 174.0F;
        float expected = 2.48572F;
        float eps = 0.0001F;
        float out = Converter.roubleToEuro(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Euros() {
        float in = 0.0F;
        float expected = 0.0F;
        float eps = 0.0001F;
        float out = Converter.roubleToEuro(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollars() {
        float in = 180.0F;
        float expected = 3.0F;
        float eps = 0.0001F;
        float out = Converter.roubleToDollar(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Dollars() {
        float in = 0.0F;
        float expected = 0.0F;
        float eps = 0.0001F;
        float out = Converter.roubleToDollar(in);
        assertEquals(expected, out, eps);
    }
}