package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test1() {
        int[] nums = new int[] {2,7,8,9,11,13,15};

        final long startTime = System.nanoTime();
        int foundIndex = binarySearch.findValue(nums, 11);
        System.out.println(System.nanoTime() - startTime);

        assertEquals(foundIndex, 4);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {2,7,8,9,11,13,15};

        final long startTime = System.nanoTime();
        int foundIndex = binarySearch.findValue(nums, 11);
        System.out.println(System.nanoTime() - startTime);

        assertEquals(foundIndex, 4);
    }

}
