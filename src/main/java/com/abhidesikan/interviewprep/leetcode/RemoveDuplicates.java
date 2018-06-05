package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

/**
 * Created by abhidesikan on 6/27/17.
 */
public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums, int val) {

		int begin = 0;
		for(int i=0; i<nums.length; i++) {
			System.out.println(Arrays.toString(nums));
			if(nums[i] != val) {
				nums[begin++] = nums[i];
			}
		}
		return begin;
	}

	public static void main(String[] args) {
		int arr [] = {1,3,3,2,2};
		int val = 3;
		System.out.println(removeDuplicates(arr, val));

	}
}
