package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class TwoSumII {

	public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		while (start < end) {
			int sum = numbers[start] + numbers[end];
			if (sum == target) {
				return new int[]{start + 1, end + 1};
			}
			if (sum > target) {
				end--;
			} else {
				start++;
			}
		}

		return new int[]{};
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,5}, 8)));
	}
}
