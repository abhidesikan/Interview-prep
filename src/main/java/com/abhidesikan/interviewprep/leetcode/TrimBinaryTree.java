package com.abhidesikan.interviewprep.leetcode;

public class TrimBinaryTree {

	public static TreeNode trimBST(TreeNode root, int L, int R) {
		if(root == null) {
			return null;
		}

		System.out.println("Root val now "+root.val);

		if(root.val < L) {
			return trimBST(root.right, L, R);
		}

		if(root.val > R) {
			return trimBST(root.left, L, R);
		}

		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);

		return root;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(1);

		System.out.println(trimBST(node, 1, 2).val);
	}
}
