package com.example.demo;

public class TwoSum {
    int[] twoSum(int[] A, int target) {
        int[] result= new int[2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] + A[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }

        return result;
    }
}
