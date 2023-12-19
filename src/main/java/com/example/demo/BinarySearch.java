package com.example.demo;

import java.util.Arrays;
import java.util.Vector;

public class BinarySearch {
    public int findValue(int[] arr, int value) {
        int foundIndex = 0, indexBoundry = arr.length - 1;

        while (foundIndex <= indexBoundry) {
            int half = foundIndex + (indexBoundry - foundIndex) / 2;

            // Check if x is present at mid
            if (arr[half] == value)
                return half;

            if (arr[half] < value)
                foundIndex = half + 1;
            else
                indexBoundry = half - 1;
        }
        return -1;
    }

    public int binarySearch(int[] arr, int value) {
        return Arrays.binarySearch(arr, value);
    }

}
