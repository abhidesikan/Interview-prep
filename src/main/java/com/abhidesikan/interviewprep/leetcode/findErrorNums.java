package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findErrorNums {
	public static int[] findErrorNums(int[] nums) {

		int duplicate = 0;
		Set<Integer> set = new HashSet();
		for(int i : nums) {
			if(set.contains(i)) {
				duplicate = i;
				break;
			}
			set.add(i);
		}
		int sum = 0;
		for(int i: nums) {
			sum += i;
		}
		int actualSum = ((nums.length) * (nums.length+1)) / 2;
		System.out.println(actualSum + " " + sum);
		int actual =  actualSum - (sum - duplicate);

		return new int[] {duplicate, actual};
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
	}

}
