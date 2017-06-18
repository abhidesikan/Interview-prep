package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 6/17/17.
 */
public class ThreeSumClosest {

	public static int threeSumClosest(int[] nums, int target) {
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int start = i + 1, end = nums.length - 1;
			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if (sum < target) {
					start++;
				} else {
					end--;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,4,8,16,32,64,128};
		System.out.println(threeSumClosest(arr, 82));
	}
}
