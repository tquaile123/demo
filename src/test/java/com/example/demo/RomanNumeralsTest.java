package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
