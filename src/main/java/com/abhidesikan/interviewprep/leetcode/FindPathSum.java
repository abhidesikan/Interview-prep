package com.abhidesikan.interviewprep.leetcode;

public class FindPathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		return hasPathSum(root, sum, 0);
	}

	public boolean hasPathSum(TreeNode node, int sum, int runningSum) {
		if (node == null) {
			return false;
		}
		runningSum += node.val;
		if (runningSum == sum && node.left == null && node.right == null) {
			return true;
		}
		return hasPathSum(node.left, sum, runningSum) || hasPathSum(node.right, sum, runningSum);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(3);
		System.out.println(new FindPathSum().hasPathSum(node, 7));
	}
}
