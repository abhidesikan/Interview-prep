package com.abhidesikan.interviewprep.leetcode;

public class SortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) {
			return null;
		}

		return sortedArrayToBST(nums, 0, nums.length-1);
	}

	public TreeNode sortedArrayToBST(int [] nums, int low, int high) {
		if(low > high) {
			return null;
		}

		int mid = (low+high)/2;

		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums, low, mid-1);
		node.right = sortedArrayToBST(nums, mid+1, high);

		return node;
	}

	public static void main(String[] args) {
		int nums [] = {1,2,4,5,7,9};
		System.out.println(new SortedArrayToBST().sortedArrayToBST(nums).val);
	}
}
