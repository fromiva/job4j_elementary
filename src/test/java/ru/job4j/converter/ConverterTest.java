package ru.job4j.converter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    float in;
    float expected;
    float out;
    float eps = 0.0001F;

    @Test
    public void whenConvert140RblThen2Euros() {
        in = 140.0F;
        expected = 2.0F;
        out = Converter.roubleToEuro(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert174RblThen2Dot48572Euros() {
        in = 174.0F;
        expected = 2.48572F;
        out = Converter.roubleToEuro(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Euros() {
        in = 0.0F;
        expected = 0.0F;
        out = Converter.roubleToEuro(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollars() {
        in = 180.0F;
        expected = 3.0F;
        out = Converter.roubleToDollar(in);
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Dollars() {
        in = 0.0F;
        expected = 0.0F;
        out = Converter.roubleToDollar(in);
        assertEquals(expected, out, eps);
    }
}