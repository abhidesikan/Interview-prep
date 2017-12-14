package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class MoveZeroes {
	public static int [] moveZeroes(int[] nums) {

		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0 && i<nums.length) {
				int index = findNonZeroNum(nums, i+1);
				if(index != -1) {
					swap(nums, i, index);
				}
			}
		}
		return nums;
	}

	public static int findNonZeroNum(int []nums, int index) {
		for(int i=index; i<nums.length; i++) {
			if(nums[i] != 0) {
				return i;
			}
		}
		return -1;
	}

	public static void swap(int [] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(moveZeroes(new int[]{0,0,1,2,3})));
	}
}
