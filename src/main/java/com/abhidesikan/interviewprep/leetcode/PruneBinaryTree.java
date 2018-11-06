package com.abhidesikan.interviewprep.leetcode;

public class PruneBinaryTree {

	public static TreeNode pruneTree(TreeNode root) {

		if(root == null) {
			return null;
		}

		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);

		if(root.left == null && root.right == null && root.val == 0) {
			return null;
		}

		return root;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(0);
		node.right = new TreeNode(1);

		System.out.println(pruneTree(node).right.val);
	}
}
