package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void test1() {
        int[] A = {1, 3, 3, 4};

        int[] expected = {0, 3};

        assertArrayEquals(expected, twoSum.twoSum(A, 5));
    }
}
