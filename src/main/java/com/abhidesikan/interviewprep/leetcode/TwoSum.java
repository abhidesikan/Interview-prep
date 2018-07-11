package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

		for(int i=0; i<nums.length; i++) {
			System.out.println(map.keySet());
			if(map.containsKey(nums[i])) {
				return new int [] {map.get(nums[i]), i};
			}
			map.put(target-nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {1,4,4,2,2,5}, 6)));
	}

}
