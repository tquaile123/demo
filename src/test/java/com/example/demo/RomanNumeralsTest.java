package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void test1() {
        String x = "III";

        assertEquals(3, romanNumerals.romanNumeralToInt(x));
    }

    @Test
    public void test2() {
        String x = "LVIII";

        assertEquals(58, romanNumerals.romanNumeralToInt(x));
    }

    @Test
    public void test3() {
        String x = "MCMXCIV";

        assertEquals(1994, romanNumerals.romanNumeralToInt(x));
    }

    @Test
    public void test11() {
        int x = 3;

        assertEquals("III", romanNumerals.intToRomanNumeral(x));
    }

    @Test
    public void test12() {
        int x = 58;

        assertEquals("LVIII", romanNumerals.intToRomanNumeral(x));
    }

    @Test
    public void test13() {
        int x = 1994;

        assertEquals("MCMXCIV", romanNumerals.intToRomanNumeral(x));
    }
}