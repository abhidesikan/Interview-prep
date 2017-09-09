package com.abhidesikan.interviewprep.leetcode;

public class MaxContiguousSubArray {

	public static int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE;
		int maxElement = Integer.MIN_VALUE;
		int curSum = 0;
		for(int i=0; i<nums.length; i++) {
			curSum += nums[i];
			curSum = Math.max(curSum, 0);
			maxSum = Math.max(maxSum, curSum);
			maxElement = Math.max(maxElement, nums[i]);
		}

		if(maxSum == 0) {
			return maxElement;
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
