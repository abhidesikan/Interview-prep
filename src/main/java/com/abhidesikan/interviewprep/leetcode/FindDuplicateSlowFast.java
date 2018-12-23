package com.abhidesikan.interviewprep.leetcode;

public class FindDuplicateSlowFast {

	public static int findDuplicate(int[] nums) {

		int slow = nums[0];
		int fast = nums[nums[0]];

		if (nums.length > 1) {
			while (slow != fast) {
				slow = nums[slow];
				fast = nums[nums[fast]];
			}
			fast = 0;
			while (fast != slow) {
				fast = nums[fast];
				slow = nums[slow];
			}
			return slow;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[] {3,1,2,2,4}));
	}
}
