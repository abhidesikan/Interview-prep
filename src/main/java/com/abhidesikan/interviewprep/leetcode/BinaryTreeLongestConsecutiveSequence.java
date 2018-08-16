package com.abhidesikan.interviewprep.leetcode;

public class BinaryTreeLongestConsecutiveSequence {

	public static int longestConsecutive(TreeNode root) {

		if (root == null) {
			return 0;
		}

		return longestConsecutive(root, root.val + 1, 1, 1);
	}

	public static int longestConsecutive(TreeNode node, int target, int cur, int max) {
		if (node == null) {
			return max;
		}

		if (node.val == target) {
			cur++;
			max = Math.max(max, cur);
		} else {
			cur = 1;
		}

		return Math.max(longestConsecutive(node.left, node.val + 1, cur, max), longestConsecutive(node.right, node.val + 1, cur, max));
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.left.right = new TreeNode(3);
		System.out.println(longestConsecutive(node));
	}
}
