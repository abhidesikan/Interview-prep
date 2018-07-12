package com.abhidesikan.interviewprep.leetcode;

public class CanPartition {

	public static boolean canPartitionKSubsets(int[] nums, int k) {

		if (nums.length == 0 || k == 0) {
			return false;
		}

		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		if (sum % k != 0) {
			return false;
		}

		int target = sum / k;
		return canPartition(nums, target, 0, 0, k);
	}

	public static boolean canPartition(int[] nums, int target, int currentSum, int start, int targetPairs) {

		if (targetPairs == 0) {
			return true;
		}

		if (currentSum == target) {
			return canPartition(nums, target, 0, 0, targetPairs - 1);
		}

		for (int i = start; i < nums.length; i++) {
			int temp = nums[i];
			nums[i] = 0;
			if (canPartition(nums, target, currentSum + temp, i + 1, targetPairs)) {
				return true;
			}
			nums[i] = temp;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(canPartitionKSubsets(new int[] {3,4,2,5,1}, 3));
	}
}
