package com.abhidesikan.interviewprep.leetcode;

public class DominantIndex {

	public static int dominantIndex(int[] nums) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}

		for(int i=0; i<nums.length; i++) {
			if(nums[i] != max && (nums[i] * 2) > max) {
				return -1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		System.out.println(dominantIndex(new int[] {1,2,3,6}));
	}
}

