package com.abhidesikan.interviewprep.leetcode;

public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		int i = 0;
		while (i < nums.length) {
			if (nums[i] == 1) {
				count++;
				i++;
				continue;
			}
			if (max < count) {
				max = count;
			}
			count = 0;
			i++;
		}
		if (max < count) {
			max = count;
		}
		return max;
	}

	public static void main(String[] args) {
		int nums[] = {1};
		System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
	}
}
