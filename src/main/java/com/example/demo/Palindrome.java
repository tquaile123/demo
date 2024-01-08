package com.example.demo;

public class Palindrome {

    public boolean isPalindrome(int x) {
        boolean ispalindrome = false;

        String forwardStr = String.valueOf(x);

        StringBuilder sb = new StringBuilder();
        sb.append(forwardStr);
        sb.reverse();
        String backwardStr = sb.toString();

        if (forwardStr.equals(backwardStr)) {
            ispalindrome = true;
        }

        return ispalindrome;
    }
}
