package com.abhidesikan.interviewprep.leetcode;

public class SingleNumber {

	public static int singleNumber(int[] nums) {

		int result = nums[0];

		for(int i=1; i<nums.length; i++) {
			result ^= nums[i];
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{3,4,4,1,1,2,2}));
	}
}
