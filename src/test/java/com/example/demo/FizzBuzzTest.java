package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1() {
        List<String> expected = List.of("1", "2", "Fizz");
        List<String> result = fizzBuzz.fizzBuzz(3);

        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        List<String> result = fizzBuzz.fizzBuzz(5);

        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        String result = fizzBuzz.fizzBuzzFunctional(5);

        assertEquals("Buzz", result);
    }


    @Test
    public void test4() {
        List<String> expected = List.of("1", "2", "Fizz");
        String result = fizzBuzz.fizzBuzz(3);

        assertEquals(expected, result);
    }

    @Test
    public void test5() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        String result = fizzBuzz.fizzBuzz(5);

        assertEquals(expected, result);
    }

    @Test
    public void test6() {
        String result = fizzBuzz.fizzBuzz(100);

        assertEquals("Buzz", result);
    }
}
}

