package com.abhidesikan.interviewprep.leetcode;

public class MaxProfit {
	public static int maxProfit(int[] prices) {

		if (prices.length == 0) {
			return 0;
		}
		int minSeen = prices[0];
		int maxDiff = Integer.MIN_VALUE;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] - minSeen > maxDiff) {
				maxDiff = prices[i] - minSeen;
			}
			if (prices[i] < minSeen) {
				minSeen = prices[i];
			}
		}

		if (maxDiff < 0) {
			return 0;
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
	}
}
