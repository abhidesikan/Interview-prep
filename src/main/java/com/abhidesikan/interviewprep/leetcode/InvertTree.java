package com.abhidesikan.interviewprep.leetcode;

public class InvertTree {
	public static TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}

		TreeNode temp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(temp);
		return root;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(3);
		node.right = new TreeNode(2);
		System.out.println(invertTree(node).left.val);
	}
}
