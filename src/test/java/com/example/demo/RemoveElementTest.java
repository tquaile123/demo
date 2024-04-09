package com.example.demo;

import com.example.demo.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement();

    @Test
    public void test1() {
        int[] nums = {3,2,2,3};

        int[] expected = {2, 2};

        int result = removeElement.removeElement(nums, 3);
        assertEquals(2, result);

    }
}
