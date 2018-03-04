package com.abhidesikan.interviewprep.leetcode;

public class ClosestValue {
	public static int closestValue(TreeNode root, double target) {
		int val = root.val;
		while(root != null) {
			if(Math.abs(root.val - target) < Math.abs(val - target)) {
				val = root.val;
			}
			root = root.val > target? root.left : root.right;
		}
		return val;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
		node.right = new TreeNode(5);
		System.out.println(closestValue(node, 2.714));
	}
}
