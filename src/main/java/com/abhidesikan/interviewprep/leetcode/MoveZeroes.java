package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class MoveZeroes {

	public static int[] moveZeroes(int[] nums) {

		int i = 0;
		while (i < nums.length && nums[i] != 0) {
			i++;
		}

		for (int j = i; j < nums.length; ) {
			if (nums[i] != 0) {
				i++;
			} else {
				if (nums[j] != 0) {
					nums[i] = nums[j];
					nums[j] = 0;
				}
				j++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(moveZeroes(new int[]{0, 0, 1, 2, 3})));
	}
}
