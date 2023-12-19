package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] indencies = new int[2];

        outerloop:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indencies[0] = i;
                    indencies[1] = j;

                    break outerloop;
                }
            }
        }

        return indencies;
    }


    // Time complexity: O(n)
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
