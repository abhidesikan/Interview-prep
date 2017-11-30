package com.abhidesikan.interviewprep.leetcode;

public class LongestUnivaluePath {

	int len = 0; // global variable
	public int longestUnivaluePath(TreeNode root) {
		if (root == null) return 0;
		len = 0;
		getLen(root);
		return len;
	}

	public void getLen(TreeNode node) {
		if(node == null) {
			return;
		}

		int temp = count(node.left, node.val) + count(node.right, node.val);
		len = Math.max(len, temp);
		getLen(node.left);
		getLen(node.right);
	}

	public int count(TreeNode node, int val) {
		if(node == null || node.val != val) {
			return 0;
		}
		int left = count(node.left, val) + 1;
		int right = count(node.right, val) + 1;
		return Math.max(left, right);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(3);
		node.right = new TreeNode(4);
		node.left.left = new TreeNode(3);

		System.out.println(new LongestUnivaluePath().longestUnivaluePath(node));
	}
}
