package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    MajorityElement majorityElement = new MajorityElement();

    @Test
    public void test1() {
        int[] nums = {3,2,3};

        int result = majorityElement.majorityElement(nums);
        assertEquals(3, result);

    }

    @Test
    public void test2() {
        int[] nums = {2,2,1,1,1,2,2};

        int result = majorityElement.majorityElement(nums);
        assertEquals(2, result);

    }
}
