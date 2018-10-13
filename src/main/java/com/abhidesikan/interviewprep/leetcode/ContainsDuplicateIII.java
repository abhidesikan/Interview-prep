package com.abhidesikan.interviewprep.leetcode;

import java.util.TreeSet;

public class ContainsDuplicateIII {

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums == null || nums.length == 0 || k <= 0) {
			return false;
		}

		final TreeSet<Integer> values = new TreeSet<>();
		for (int ind = 0; ind < nums.length; ind++) {

			final Integer floor = values.floor(nums[ind] + t);
			final Integer ceil = values.ceiling(nums[ind] - t);

			System.out.println(floor + " " + ceil + " " + nums[ind]);
			if ((floor != null && floor >= nums[ind])
					|| (ceil != null && ceil <= nums[ind])) {
				return true;
			}

			values.add(nums[ind]);
			if (ind >= k) {
				values.remove(nums[ind - k]);
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));
	}
}
