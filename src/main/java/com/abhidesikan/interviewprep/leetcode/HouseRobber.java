package com.abhidesikan.interviewprep.leetcode;

public class HouseRobber {

	public static int rob(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int prev1 = 0;
		int prev2 = 0;

		for (int i = 0; i < nums.length; i++) {
			int temp = prev1;
			prev1 = Math.max(prev2 + nums[i], prev1);
			prev2 = temp;
		}

		return prev1;
	}

	public static void main(String[] args) {
		System.out.println(rob(new int[] {2,5,3,6,1})) ;
	}
}
