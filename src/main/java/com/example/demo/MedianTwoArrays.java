package com.example.demo;

import java.util.Arrays;

public class MedianTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedNums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, combinedNums, nums1.length, nums2.length);

        Arrays.sort(combinedNums);

        return (combinedNums.length % 2 != 0) ? (double)combinedNums[combinedNums.length / 2] : (double)(combinedNums[(combinedNums.length - 1) / 2] + combinedNums[combinedNums.length / 2]) / 2.0;
    }
}
