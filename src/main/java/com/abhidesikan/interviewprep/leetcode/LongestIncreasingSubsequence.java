package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int lengthOfLIS(int[] nums) {

		int result [] = new int[nums.length];

		Arrays.fill(result, 1);

		int i = 1;

		while(i < nums.length) {
			for(int j=0; j<i; j++) {
				if(nums[j] < nums[i]) {
					if(result[j] + 1 > result[i]) {
						result [i] = result[j] + 1;
					}
				}
			}
			i++;
		}

		int length = 0;

		for(int k=0; k<result.length; k++) {
			length = Math.max(length, result[k]);
		}

		return length;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLIS(new int[]{2,-1,3,4,101,5,6}));
	}
}
