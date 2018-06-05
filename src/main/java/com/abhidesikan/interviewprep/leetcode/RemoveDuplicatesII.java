package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesII {

	public static int removeDuplicates(int[] nums) {
		int index = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i - 1]) {
				System.out.println(Arrays.toString(nums));
				nums[index++] = nums[i];
				System.out.println(Arrays.toString(nums));
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}
}
