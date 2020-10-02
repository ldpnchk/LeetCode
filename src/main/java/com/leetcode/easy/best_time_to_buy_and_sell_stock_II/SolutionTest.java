package com.leetcode.easy.best_time_to_buy_and_sell_stock_II;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {
        
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int actual = new Solution().maxProfit(prices);
        
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] prices = { 1, 2, 3, 4, 5 };
        int actual = new Solution().maxProfit(prices);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] prices = { 7, 6, 4, 3, 1 };
        int actual = new Solution().maxProfit(prices);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int[] prices = { 1, 1, 1, 1, 1 };
        int actual = new Solution().maxProfit(prices);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test_5() {

        int[] prices = { 1 };
        int actual = new Solution().maxProfit(prices);

        int expected = 0;

        assertEquals(expected, actual);
    }

}
