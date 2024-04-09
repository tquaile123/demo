package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesSortedArrayTest {
    RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();

    @Test
    public void test1() {
        int[] nums = {1,2,2};

        int result = removeDuplicatesSortedArray.removeDuplicates(nums);
        assertEquals(2, result);

    }
}
