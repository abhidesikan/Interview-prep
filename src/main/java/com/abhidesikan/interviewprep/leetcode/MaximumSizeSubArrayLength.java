package com.abhidesikan.interviewprep.leetcode;

import java.util.HashMap;

public class MaximumSizeSubArrayLength {

	public static int maxSubArrayLen(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap();
		int sum = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			if (sum == k) {
				max = i + 1;
			} else if (map.containsKey(sum - k)) {
				max = Math.max(max, i - map.get(sum - k));
			}
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxSubArrayLen(new int[] {3,5,2,4,6}, 10));
	}
}
