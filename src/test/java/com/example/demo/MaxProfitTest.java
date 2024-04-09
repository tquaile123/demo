package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitTest {
    MaxProfit maxProfit = new MaxProfit();

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};

        assertEquals(5, maxProfit.maxProfit(prices));
    }

    @Test
    public void test2() {
        int[] prices = {7,6,4,3,1};

        assertEquals(0, maxProfit.maxProfit(prices));
    }
}
