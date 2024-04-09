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
    public boolean isPalindrome(String x) {
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

    /*
    Given two integers N and K returns a palindrome of length of length N which consist of K distinct lower case letters
    example for N= 5 K=2
    output => abbba
    There are many other possibilities like - zdzdz. but not aaaaa because it contains only one character
    give the optimize solution for the above problem
     */

    public String generatePalidrome(int N, int K) {
        StringBuffer sb = new StringBuffer();

        char[] letters = new char[K];
        for (int i = 0; i < K; i++) {
            letters[i] = (char) ('a' + i);
        }

        int mid = N / 2;
        boolean midpointIsOdd = N % 2 != 0;

        for (int i = 0; i < mid; i++) {
            sb.append(letters[i % K]);
        }
        if (midpointIsOdd)
            sb.append(letters[K - 1]);

        for (int i = mid - 1; i >= 0; i--) {
            sb.append(letters[i % K]);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

}
