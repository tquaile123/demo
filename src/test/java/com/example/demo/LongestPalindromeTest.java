package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void test1() {
        assertEquals("aba", longestPalindrome.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        assertEquals("bb", longestPalindrome.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals("", longestPalindrome.longestPalindrome("abcdef"));
    }
}
