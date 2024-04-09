package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianTwoArraysTest {

    MedianTwoArrays medianTwoArrays = new MedianTwoArrays();
    @Test
    public void test1() {
        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2};

        assertEquals(2.0000, medianTwoArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};

        assertEquals(2.5000, medianTwoArrays.findMedianSortedArrays(nums1, nums2));
    }

}
