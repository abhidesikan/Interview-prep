package com.abhidesikan.interviewprep.leetcode;

public class MaxConsecutiveOnesII {

	public static int findMaxConsecutiveOnes(int[] nums) {

		int max = 0;
		int q = -1;
		for (int l = 0, h = 0; h < nums.length; h++) {
			if (nums[h] == 0) {
				l = q + 1;
				q = h;
			}
			max = Math.max(max, h - l + 1);
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1,1,1,1}));
	}

}
