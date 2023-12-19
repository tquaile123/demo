package com.example.demo;

import com.example.demo.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testLengthOfLongestSubstring1() {
        String s = "abcabcbb";

        assertEquals(solution.lengthOfLongestSubstring(s), 3);
    }

}
