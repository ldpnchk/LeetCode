package com.leetcode.easy.best_time_to_buy_and_sell_stock_II;

/**
 * Best Time to Buy and Sell Stock II
 *
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 *
 * Constraints:
 * 1 <= prices.length <= 3 * 10 ^ 4
 * 0 <= prices[i] <= 10 ^ 4
 */

public class Solution {

    public int maxProfit(int[] prices) {

        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
             if (prices[i] > prices[i - 1]) {
                 totalProfit += prices[i] - prices[i - 1];
             }
        }

        return totalProfit;
    }

}
