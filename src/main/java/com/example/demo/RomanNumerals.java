package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {
    public int romanNumeralToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    public String intToRomanNumeral(int number) {
        TreeMap<Integer, String> romanValues = new TreeMap<>();
        romanValues.put(1000, "M");
        romanValues.put(900, "CM");
        romanValues.put(500, "D");
        romanValues.put(400, "CD");
        romanValues.put(100, "C");
        romanValues.put(90, "XC");
        romanValues.put(50, "L");
        romanValues.put(40, "XL");
        romanValues.put(10, "X");
        romanValues.put(9, "IX");
        romanValues.put(5, "V");
        romanValues.put(4, "IV");
        romanValues.put(1, "I");

        int l =  romanValues.floorKey(number);
        if ( number == l ) {
            return romanValues.get(number);
        }

        return romanValues.get(l) + intToRomanNumeral(number - l);
    }

}
