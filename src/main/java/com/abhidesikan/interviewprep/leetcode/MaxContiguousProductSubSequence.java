package com.abhidesikan.interviewprep.leetcode;

public class MaxContiguousProductSubSequence {

	public static int maxProduct(int[] nums) {

		int max = nums[0];
		int maxSeen = nums[0];
		int minSeen = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < 0) {
				int temp = maxSeen;
				maxSeen = minSeen;
				minSeen = temp;
			}
			maxSeen = Math.max(maxSeen * nums[i], nums[i]);
			minSeen = Math.min(minSeen * nums[i], nums[i]);
			max = Math.max(Math.max(maxSeen, minSeen), max);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] {2,-4,-5,1}));
	}
}
