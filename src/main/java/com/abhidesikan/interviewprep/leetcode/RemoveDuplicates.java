package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

/**
 * Created by abhidesikan on 6/27/17.
 */
public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {

		if(nums.length == 0) {
			return 0;
		}
		if(nums.length == 1) {
			return 1;
		}
		int i=1;
		for (int n : nums) {
			if (n > nums[i-1])
				nums[i++] = n;
		}
		return i;
	}

	public static void main(String[] args) {
		int arr [] = {1};
		System.out.println(removeDuplicates(arr));

	}
}
