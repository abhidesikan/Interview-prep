package com.abhidesikan.interviewprep.leetcode;

public class MaximumBinaryTree {

	public static TreeNode constructMaximumBinaryTree(int[] nums) {

		return buildTree(nums, 0, nums.length-1);
	}

	public static TreeNode buildTree(int [] nums, int start, int end) {

		if(start > end) {
			return null;
		}
		int maxIndex = start;

		for(int i=start+1; i<=end; i++) {
			if(nums[i] > nums[maxIndex]) {
				maxIndex = i;
			}
		}

		TreeNode node = new TreeNode(nums[maxIndex]);
		node.left = buildTree(nums, start, maxIndex-1);
		node.right = buildTree(nums, maxIndex+1, end);

		return node;
	}

	public static void main(String[] args) {
		System.out.println(constructMaximumBinaryTree(new int[] {3,5,6,1,7,9}));
	}
}
