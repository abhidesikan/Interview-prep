package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> list = new ArrayList();

		for(int i=0; i<nums.length; i++) {
			int index = Math.abs(nums[i]);

			if(nums[index-1] > 0) {
				nums[index-1] = -nums[index-1];
			} else {
				list.add(Math.abs(nums[i]));
			}
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[] {2,3,5,5,1,6,6}));
	}
}
