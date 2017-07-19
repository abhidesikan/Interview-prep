package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 7/18/17.
 */
public class MaxAverageInArray {
	public double findMaxAverage(int[] nums, int k) {
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		if (nums.length == 0) {
			return 0.0;
		} else if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0; i <= nums.length - k; i++) {
			for (int j = i; j < i + k; j++) {
				curSum += nums[j];
			}
			if (curSum > maxSum) {
				maxSum = curSum;
			}
			curSum = 0;
		}
		return (double) maxSum / k;
	}

	public static void main(String[] args) {
		int arr[] = {4, 0, 4, 3, 3};
		System.out.println(new MaxAverageInArray().findMaxAverage(arr, 5));
	}
}
