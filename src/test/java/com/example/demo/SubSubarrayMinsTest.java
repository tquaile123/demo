package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubSubarrayMinsTest {

    SubSubarrayMins subSubarrayMins = new SubSubarrayMins();

    @Test
    public void test1() {
        int[] arr = new int[] {3,1,2,4};

        assertEquals(subSubarrayMins.sumSubarrayMins(arr), 17);
    }


}
