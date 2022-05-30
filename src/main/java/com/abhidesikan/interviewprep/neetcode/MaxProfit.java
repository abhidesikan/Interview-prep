package com.abhidesikan.interviewprep.neetcode;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
                right++;
                continue;
            }

            maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            right++;
        }
        return maxProfit;
    }
}
