package com.practice.twothreesum;

import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * Problem: Best Time to Buy and Sell Stock
 * Pattern: Two Pointers
 * Difficulty: Easy
 * LeetCode: 121
 * ============================================================
 *
 * Problem Statement:
 *
 * You are given an array prices where prices[i]
 * represents the stock price on the ith day.
 *
 * You want to maximize your profit by choosing:
 *
 * 1. One day to BUY the stock.
 * 2. A different future day to SELL the stock.
 *
 * Return the maximum profit you can achieve.
 *
 * If no profit can be made, return 0.
 *
 * ============================================================
 * Examples
 * ============================================================
 *
 * Example 1:
 *
 * Input:
 * prices = [7,1,5,3,6,4]
 *
 * Output:
 * 5
 *
 * Explanation:
 * Buy at price 1
 * Sell at price 6
 *
 * Profit = 6 - 1 = 5
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * prices = [7,6,4,3,1]
 *
 * Output:
 * 0
 *
 * Explanation:
 * Prices keep decreasing.
 * No profitable transaction exists.
 *
 * ============================================================
 * Understanding the Pattern
 * ============================================================
 *
 * We maintain two pointers:
 *
 * buy  -> Best day to buy so far
 * sell -> Current day being examined
 *
 * Goal:
 * Find the maximum value of:
 *
 * sellPrice - buyPrice
 *
 * ============================================================
 * Key Observation
 * ============================================================
 *
 * If we find a cheaper price:
 *
 * prices[sell] < prices[buy]
 *
 * then buying at the current sell day is better than
 * buying at the previous buy day.
 *
 * Therefore:
 *
 * buy = sell
 *
 * ============================================================
 * Algorithm
 * ============================================================
 *
 * Step 1:
 * Initialize:
 *
 * buy = 0
 * sell = 1
 * maxProfit = 0
 *
 * ------------------------------------------------------------
 *
 * Step 2:
 * While sell is within array bounds:
 *
 * Case 1:
 * prices[sell] > prices[buy]
 *
 * --> A profit is possible
 *
 * profit = prices[sell] - prices[buy]
 *
 * maxProfit =
 *      max(maxProfit, profit)
 *
 * ------------------------------------------------------------
 *
 * Case 2:
 * prices[sell] <= prices[buy]
 *
 * --> Found a cheaper day to buy
 *
 * buy = sell
 *
 * ------------------------------------------------------------
 *
 * Move:
 *
 * sell++
 *
 * ============================================================
 * Dry Run
 * ============================================================
 *
 * prices = [7,1,5,3,6,4]
 *
 * buy = 7
 * sell = 1
 *
 * 1 < 7
 * update buy = 1
 *
 * --------------------------------
 *
 * buy = 1
 * sell = 5
 *
 * profit = 5 - 1 = 4
 * maxProfit = 4
 *
 * --------------------------------
 *
 * buy = 1
 * sell = 3
 *
 * profit = 2
 * maxProfit = 4
 *
 * --------------------------------
 *
 * buy = 1
 * sell = 6
 *
 * profit = 5
 * maxProfit = 5
 *
 * --------------------------------
 *
 * buy = 1
 * sell = 4
 *
 * profit = 3
 * maxProfit = 5
 *
 * ============================================================
 * Final Answer
 * ============================================================
 *
 * Maximum Profit = 5
 *
 * Buy at 1
 * Sell at 6
 *
 * ============================================================
 * Complexity Analysis
 * ============================================================
 *
 * Time Complexity:
 * O(n)
 *
 * Each element is visited once.
 *
 * ------------------------------------------------------------
 *
 * Space Complexity:
 * O(1)
 *
 * Only a few variables are used.
 *
 * ============================================================
 * Interview Learning
 * ============================================================
 *
 * Think:
 *
 * buy  = Lowest price seen so far
 * sell = Current day
 *
 * If a lower price is found:
 *     Update buy
 *
 * Else:
 *     Calculate profit
 *     Update maxProfit
 *
 * ============================================================
 */

public class BuySell {

	private int buySell(int[] prices) {
		int sell = 1;
		int buy = 0;
		int maxprofit = 0;
		while (sell<prices.length) {
			
			if(prices[sell]>prices[buy]) {
				int profit =prices[sell]-prices[buy];
				maxprofit=	Math.max(maxprofit,profit);
			}else {
				buy=sell;
				
			}
			sell++;
		}

		return maxprofit;
	}

	public static void main(String[] args) {
		BuySell t = new BuySell();
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		int profit = t.buySell(arr);

		System.out.println(profit);

	}
}
