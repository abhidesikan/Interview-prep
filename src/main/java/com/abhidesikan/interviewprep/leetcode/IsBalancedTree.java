package com.abhidesikan.interviewprep.leetcode;

public class IsBalancedTree {

	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}

		int left = checkHeight(root.left);
		int right = checkHeight(root.right);

		return (Math.abs(left-right) <=1 && isBalanced(root.left) && isBalanced(root.right));

	}

	public int checkHeight(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return Math.max(checkHeight(node.left) +1, checkHeight(node.right)+1);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(3);
		node.left.right = new TreeNode(1);
		System.out.println(new IsBalancedTree().isBalanced(node));
	}
}
