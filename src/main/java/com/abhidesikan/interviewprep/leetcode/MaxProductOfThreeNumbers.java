package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class MaxProductOfThreeNumbers {

	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length-1;
		return Math.max(nums[0]*nums[1]*nums[len], nums[len]*nums[len-1]*nums[len-2]);
	}

	public static void main(String[] args) {
		System.out.println(maximumProduct(new int[] {2,4,5,-5,-7}));
	}
}
