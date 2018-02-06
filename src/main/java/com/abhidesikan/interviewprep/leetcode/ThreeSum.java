package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 6/17/17.
 */
public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		if(nums.length == 0) {
			return result;
		}


		Arrays.sort(nums);

		for(int i=0; i+2 < nums.length; i++) {
			if(i > 0 && nums[i-1] == nums[i]) {
				continue;
			}
			int j=i+1; int k = nums.length-1;

			int target = -nums[i];
			while(j < k) {
				if(nums[j] + nums[k] == target) {
					List list = new ArrayList();
					list.add(nums[i]); list.add(nums[j]); list.add(nums[k]);
					result.add(list);
					j++;
					k--;
					while (j < k && nums[j] == nums[j-1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k+1]) {
						k--;
					}
				} else if(nums[j] + nums[k] > target) {
					k--;
				} else {
					j++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = {-4, -2, -2, 4};
		System.out.println(threeSum(arr));
	}
}
