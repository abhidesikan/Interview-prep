package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static List<String> summaryRanges(int[] nums) {

		List<String> result = new ArrayList();
		StringBuilder sb = new StringBuilder();

		if (nums.length == 0) {
			return result;
		}

		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
			while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
				flag = true;
				i++;
			}
			if (flag) {
				sb.append("->");
				sb.append(nums[i]);
			}
			result.add(sb.toString());
			sb.setLength(0);
			flag = false;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(summaryRanges(new int[] {1,2,3,4,7,8,9,10}));
	}
}
