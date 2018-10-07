package com.abhidesikan.interviewprep.leetcode;

public class WiggleSort {

	public static void wiggleSort(int[] nums) {

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
	}

	public static void swap(int [] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		wiggleSort(new int[] {1,3,2,4,5});
	}
}
