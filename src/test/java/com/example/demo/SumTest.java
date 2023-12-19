package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void test1() {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        Sum sum = new Sum();
        int[] answer = new int[] {0,1};

        int[] result = sum.twoSum(nums, target);
        assertArrayEquals(result, answer);

    }

    @Test
    public void test2() {
        int[] nums = new int[] {3,2,4};
        int target = 6;

        Sum sum = new Sum();
        int[] answer = new int[] {1,2};

        int[] result = sum.twoSum(nums, target);
        assertArrayEquals(result, answer);

    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        Sum sum = new Sum();
        int[] answer = new int[]{0, 1};

        int[] result = sum.twoSum(nums, target);
        assertArrayEquals(result, answer);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{3,2,3};
        int target = 6;

        Sum sum = new Sum();
        int[] answer = new int[]{0, 2};

        int[] result = sum.twoSum(nums, target);
        assertArrayEquals(result, answer);
    }

    @Test
    public void test5() {
        int[] nums = new int[]{2,5,5,11};
        int target = 10;

        Sum sum = new Sum();
        int[] answer = new int[]{1, 2};

        int[] result = sum.twoSum(nums, target);
        assertArrayEquals(result, answer);
    }

    @Test
    public void test11() {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        Sum sum = new Sum();
        int[] answer = new int[] {0,1};

        int[] result = sum.twoSumHashMap(nums, target);
        assertArrayEquals(result, answer);

    }

    @Test
    public void test12() {
        int[] nums = new int[] {3,2,4};
        int target = 6;

        Sum sum = new Sum();
        int[] answer = new int[] {1,2};

        int[] result = sum.twoSumHashMap(nums, target);
        assertArrayEquals(result, answer);

    }

    @Test
    public void test13() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        Sum sum = new Sum();
        int[] answer = new int[]{0, 1};

        int[] result = sum.twoSumHashMap(nums, target);
        assertArrayEquals(result, answer);
    }

    @Test
    public void test14() {
        int[] nums = new int[]{3,2,3};
        int target = 6;

        Sum sum = new Sum();
        int[] answer = new int[]{0, 2};

        int[] result = sum.twoSumHashMap(nums, target);
        assertArrayEquals(result, answer);
    }

    @Test
    public void test15() {
        int[] nums = new int[]{2,5,5,11};
        int target = 10;

        Sum sum = new Sum();
        int[] answer = new int[]{1, 2};

        int[] result = sum.twoSumHashMap(nums, target);
        assertArrayEquals(result, answer);
    }
}
