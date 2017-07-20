package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class UnsortedSubArray {

	public int findUnsortedSubarray(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();

		int l = nums.length - 1;
		int r = 0;

		for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
				l = Math.min(l, stack.pop());
			}
			stack.push(i);
		}

		stack.clear();

		for (int i = nums.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
				r = Math.max(r, stack.pop());
			}
			stack.push(i);
		}

		return r - l > 0 ? r - l + 1 : 0;
	}

	public static void main(String[] args) {
		int nums[] = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(new UnsortedSubArray().findUnsortedSubarray(nums));
	}
}
