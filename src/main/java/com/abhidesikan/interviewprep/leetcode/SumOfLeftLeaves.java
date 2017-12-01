package com.abhidesikan.interviewprep.leetcode;

public class SumOfLeftLeaves {
	static int sum = 0;
	public static int sumOfLeftLeaves(TreeNode root) {
		if(root == null) {
			return 0;
		}

		if(root.left != null && root.left.left == null && root.left.right == null) {
			sum+= root.left.val;
		}
		sumOfLeftLeaves(root.left);
		sumOfLeftLeaves(root.right);
		return sum;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
		System.out.println(sumOfLeftLeaves(node));
	}
}
