package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class WiggleSort {

	public static int [] wiggleSort(int[] nums) {

		for(int i=0; i<nums.length-1; i++) {
			if(i % 2 == 0) {
				if(nums[i] > nums[i+1]) {
					swap(nums, i, i+1);
				}
			} else {
				if(nums[i] < nums[i+1]) {
					swap(nums, i, i+1);
				}
			}
		}
		return nums;
	}

	public static void swap(int [] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(wiggleSort(new int[] {1,2,3,4,5})));
	}
}
