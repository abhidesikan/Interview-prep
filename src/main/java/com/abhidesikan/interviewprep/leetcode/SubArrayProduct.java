package com.abhidesikan.interviewprep.leetcode;

public class SubArrayProduct {
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		int count = 0;
		int product = 1;
		for(int i=0, j=0; j<nums.length; j++) {
			product *= nums[j];
			while(i <=j && product >= k) {
				product /= nums[i++];
			}
			count += j + 1 - i;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numSubarrayProductLessThanK(new int[] {3,4,5,10}, 13));
	}
}
