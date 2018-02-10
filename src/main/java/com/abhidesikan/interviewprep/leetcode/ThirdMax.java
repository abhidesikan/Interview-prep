package com.abhidesikan.interviewprep.leetcode;

public class ThirdMax {
	public static int thirdMax(int[] nums) {

		Integer thirdMax, secondMax, max;
		thirdMax = secondMax = max = null;

		for(Integer i : nums) {
			if(i.equals(thirdMax) || i.equals(secondMax) || i.equals(max)) {
				continue;
			}
			if(max == null || i > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = i;
			} else if(secondMax == null || i > secondMax) {
				thirdMax = secondMax;
				secondMax = i;
			} else if(thirdMax == null || i > thirdMax) {
				thirdMax = i;
			}
		}

		return thirdMax == null ? max : thirdMax;
	}

	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] {1,4,5,5,6}));
	}
}
