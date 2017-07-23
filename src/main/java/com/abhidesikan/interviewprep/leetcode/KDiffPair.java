package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class KDiffPair {

	public int findPairs(int[] nums, int k) {

		if (nums == null || nums.length == 0 || k < 0) {
			return 0;
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (k == 0) {
				if (entry.getValue() >= 2) {
					count++;
				}
			} else {
				if (map.containsKey(entry.getKey() + k)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = {3, 1, 4, 1, 5};
		System.out.println(new KDiffPair().findPairs(nums, 2));
	}
}
