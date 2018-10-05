package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class MoveZeroes {

	public static int[] moveZeroes(int[] nums) {

		int j=0;

		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}

		while(j < nums.length) {
			nums[j] = 0;
			j++;
		}

		return nums;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(moveZeroes(new int[]{0, 0, 1, 2, 3})));
	}
}
