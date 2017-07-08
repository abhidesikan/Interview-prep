package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 7/8/17.
 */
public class MaxDiameterOfTree {

	int diameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {

		if(root == null) {
			return 0;
		}
		height(root);
		return diameter;
	}

	public int height(TreeNode node) {
		if(node == null) {
			return 0;
		}
		int left = height(node.left);
		int right = height(node.right);
		diameter = Math.max(diameter, left+right);
		return Math.max(left,right) +1;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(new MaxDiameterOfTree().diameterOfBinaryTree(root));
	}
}
