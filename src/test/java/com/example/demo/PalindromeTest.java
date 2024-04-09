package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {


    Palindrome palindrome = new Palindrome();

    @Test
    public void test1() {
        int x = 121;

        assertTrue(palindrome.isPalindrome(x));
    }

    @Test
    public void test2() {
        int x = 123;

        assertFalse(palindrome.isPalindrome(x));
    }

    @Test
    public void test3() {
        int x = -121;

        assertFalse(palindrome.isPalindrome(x));
    }

    @Test
    public void test4() {
        int x = 10;

        assertFalse(palindrome.isPalindrome(x));
    }

    @Test
    public void test10(){
        String result = palindrome.generatePalidrome(5,2);
        assertTrue(palindrome.isPalindrome(result));
    }

    @Test
    public void test11() {
        String result = palindrome.generatePalidrome(4,2);
        assertTrue(palindrome.isPalindrome(result));
    }

    @Test
    public void test12() {
        String result = palindrome.generatePalidrome(7,3);
        assertTrue(palindrome.isPalindrome(result));
    }

    @Test
    public void test13() {
        String result = palindrome.generatePalidrome(8,4);
        assertTrue(palindrome.isPalindrome(result));
    }
}
