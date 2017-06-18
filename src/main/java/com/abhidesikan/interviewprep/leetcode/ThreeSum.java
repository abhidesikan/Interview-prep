package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 6/17/17.
 */
public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();

		HashSet<List<Integer>> set = new HashSet<List<Integer>>();

		if (nums.length < 3) {
			return finalList;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
			for (int j = i + 1, k = nums.length - 1; j < k; ) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					if (set.add(list)) {
						finalList.add(list);
					}
					j++;
					k--;
				} else if (nums[i] + nums[j] + nums[k] < 0) {
					j++;
				} else {
					k--;
				}
			}
		}

		return finalList;
	}

	public static void main(String[] args) {
		int arr[] = {-4, -2, -2, 4};
		System.out.println(threeSum(arr));
	}
}
