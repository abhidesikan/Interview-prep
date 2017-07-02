package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

/**
 * Created by abhidesikan on 7/2/17.
 */
public class SearchForRange {
	public static int[] searchRange(int[] nums, int target) {
		int arr[] = {-1,-1};

		if(nums.length == 0) {
			return arr;
		}

		if(nums.length == 1) {
			if(nums[0] == target) {
				arr[0] = 0;
				arr[1] = 0;
			}
			return arr;
		}

		int initial = Integer.MAX_VALUE, finalVal = 0;
		int i=0; int j=nums.length-1;

		while(i <= j) {
			if(nums[i] == target && i < initial ) {
				initial = i;
			}
			if(nums[j] == target && j >= finalVal) {
				finalVal = j;
			}
			if(nums[i] < target) {
				i++;
			} else {
				j--;
			}
		}
		if(initial == Integer.MAX_VALUE) {
			return arr;
		}
		arr[0] = initial;
		arr[1] = finalVal;
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,6,6,7,9};
		System.out.println(Arrays.toString(searchRange(arr, 6)));
	}
}
