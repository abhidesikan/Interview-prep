package com.abhidesikan.interviewprep.leetcode;

public class MaxProfitII {
	public static int maxProfit(int[] prices) {

		if (prices.length < 1) {
			return 0;
		}
		int total = 0;
		int previous = prices[0];

		for (int i = 1; i < prices.length; i++) {
			if (previous < prices[i]) {
				total += prices[i] - previous;
			}
			previous = prices[i];
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{7,1,2,4,5,6}));
	}
}
