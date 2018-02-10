package com.abhidesikan.interviewprep.leetcode;

public class OptimalDivision {

	public static String optimalDivision(int[] nums) {

		StringBuilder sb = new StringBuilder();

		if(nums.length == 0) {
			return "";
		}

		if(nums.length <= 1) {
			return sb.append(nums[0]).toString();
		}

		if(nums.length == 2) {
			return sb.append(nums[0]).append("/").append(nums[1]).toString();
		}

		sb.append(nums[0]).append("/(");

		for(int i=1; i<nums.length; i++) {
			sb.append(nums[i]).append("/");
		}
		sb.replace(sb.length()-1, sb.length(), ")");

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(optimalDivision(new int[]{4,3,2}));
	}
}
