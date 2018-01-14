package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSlidingWindow {

	public static int[] maxSlidingWindow(int[] nums, int k) {

		if(k == 1 || k == 0) {
			return nums;
		}
		List<Integer> list = new ArrayList<Integer>();
		int c = k;
		for(int i=0; i<=nums.length - k; i++) {
			int curMax = Integer.MIN_VALUE;
			int j = i;
			while(c > 0) {
				if(nums[j] > curMax) {
					curMax = nums[j];
				}
				c--;
				j++;
			}
			list.add(curMax);
			c = k;
		}

		int[] array = list.stream().mapToInt(i->i).toArray();
		return array;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] {2,4,1,5,6,-5}, 3)));
	}
}
