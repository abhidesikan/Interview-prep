package com.abhidesikan.interviewprep.leetcode;

public class MinNumberOfMoves {

	public static int minMoves(int[] nums) {

		int minMoves = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			min = Math.min(min, nums[i]);
		}

		return sum - (min)*nums.length;
	}

	public static void main(String[] args) {
		System.out.println(minMoves(new int[]{1,2,3}));
	}
}
