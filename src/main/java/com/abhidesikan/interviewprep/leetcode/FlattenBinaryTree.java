package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class FlattenBinaryTree {

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
			if (!stack.isEmpty()) {
				node.right = stack.peek();
			}
			node.left = null;

		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.right = new TreeNode(6);
		node.left = new TreeNode(7);
		new FlattenBinaryTree().flatten(node);
		System.out.println(node.right.val);
	}
}

