package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int[] expected = {1,2,2,3,5,6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int[] expected = {1,2,2,3,5,6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }
}
