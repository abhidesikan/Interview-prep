package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ret = new ArrayList<Integer>();

		for(int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			System.out.println(val);
			if(nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			if(nums[i] > 0) {
				ret.add(i+1);
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(new FindMissingNumber().findDisappearedNumbers(nums));
	}
}
