package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class ArrayPairSum {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);

		if(nums.length < 2) {
			return 0;
		}

		int sum = 0;
		for(int i=0; i<nums.length; i+=2) {
			sum += Math.min(nums[i], nums[i+1]);
		}

		return sum;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,2,4};
		System.out.println(new ArrayPairSum().arrayPairSum(arr));
	}
}
