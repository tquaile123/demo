package com.example.demo;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int currentM = m;
//        for (int i = 0; i < n; i++) {
//            nums1[currentM] = nums2[i];
//            currentM++;
//        }
        System.arraycopy(nums2, 0, nums1, m, n);

        Arrays.sort(nums1);
    }
}
