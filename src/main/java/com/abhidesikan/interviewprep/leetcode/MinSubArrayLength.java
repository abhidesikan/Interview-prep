package com.abhidesikan.interviewprep.leetcode;

public class MinSubArrayLength {

	public static int minSubArrayLen(int s, int[] nums) {

		int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

		while (j < nums.length) {
			sum += nums[j++];

			while (sum >= s) {
				min = Math.min(min, j - i);
				sum -= nums[i++];
			}
		}

		return min == Integer.MAX_VALUE ? 0 : min;
	}

	public static void main(String[] args) {
		System.out.println(minSubArrayLen(10, new int[] {2,5,3,4,6}));
	}
}
