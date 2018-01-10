package com.abhidesikan.interviewprep.leetcode;

public class FindDuplicate {

	public static int findDuplicate(int[] nums) {
		int low = 1, high = nums.length - 1;
		while (low <= high) {
			int mid = (int) (low + (high - low) * 0.5);
			int cnt = 0;
			for (int a : nums) {
				if (a <= mid) ++cnt;
			}
			if (cnt <= mid) low = mid + 1;
			else high = mid - 1;
		}
		return low;
	}

	public static void main(String[] args) {
		int arr [] = new int [] {3,2,2,3};
		System.out.println(findDuplicate(arr));
	}


}
