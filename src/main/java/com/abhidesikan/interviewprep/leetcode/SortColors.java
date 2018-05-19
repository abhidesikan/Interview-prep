package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class SortColors {

	public static void sortColors(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		for (int i = 0; i <= end; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[start];
				nums[start] = 0;
				start++;
			} else if (nums[i] == 2) {
				nums[i] = nums[end];
				nums[end] = 2;
				end--;
				i--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		sortColors(new int[]{2,0,0,1,2,0,2});
	}
}
