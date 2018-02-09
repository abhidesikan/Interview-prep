package com.abhidesikan.interviewprep.leetcode;

public class MissingNumber {

	public static int missingNumber(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		int actualSum = ((nums.length) * (nums.length + 1)) / 2;

		return actualSum - sum;
	}

	public static int missingNumberXor(int[] nums) {

		int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}

		return xor ^ i;
	}

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[]{0, 3, 1, 2, 5, 4}));
		System.out.println(missingNumberXor(new int[]{0, 3, 1, 2, 5, 4}));
	}
}
