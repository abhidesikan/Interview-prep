package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class NextPermutation {

	public static void nextPermutation(int[] nums) {

		boolean max = true;
		for(int i=nums.length-1; i>0; i--) {
			if(nums[i-1] >= nums[i]) {
				continue;
			} else {
				int j = i-1;
				int index = findIndexToReplace(nums, j+1, nums[j]);
				int swap = nums[index];
				nums[index] = nums[j];
				nums[j] = swap;
				swap(nums, j+1, nums.length-1);
				max = false;
				break;
			}
		}

		if(max) {
			swap(nums, 0, nums.length-1);
		}
	}

	public static int findIndexToReplace(int nums[], int j, int num) {
		for(int i=nums.length-1; i>=j; i--) {
			if(nums[i] > num) {
				return i;
			}
		}
		return 0;
	}

	public static void swap(int nums[], int i, int j) {
		while(i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int [] nums = new int[]{1,4,2,6,5,1};
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}
