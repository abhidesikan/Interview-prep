package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/10/17.
 */
public class MergeTrees {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		} else if (t2 == null) {
			return t1;
		}

		TreeNode node = null;
		int maxHeight = Math.max(getHeight(t1), getHeight(t2));
		int curHeight = 0;
		node = mergeTrees(t1, t2, node, maxHeight, curHeight);
		return node;
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2, TreeNode node, int maxHeight, int curHeight) {
		if (curHeight < maxHeight) {
			curHeight++;
			if (t1 != null && t2 != null) {
				node = new TreeNode(t1.val + t2.val);
			} else if (t1 != null) {
				node = new TreeNode(t1.val);
			} else if (t2 != null) {
				node = new TreeNode(t2.val);
			} else {
				return null;
			}
			if(t1 != null && t2 != null) {
				node.left = mergeTrees(t1.left, t2.left, node.left, maxHeight, curHeight);
				node.right = mergeTrees(t1.right, t2.right, node.right, maxHeight, curHeight);
			} else if (t1 != null) {
				node.left = mergeTrees(t1.left, null, node.left, maxHeight, curHeight);
				node.right = mergeTrees(t1.right, null, node.right, maxHeight, curHeight);
			} else if (t2 != null) {
				node.left = mergeTrees(null, t2.left, node.left, maxHeight, curHeight);
				node.right = mergeTrees(null, t2.right, node.right, maxHeight, curHeight);
			}

		}
		return node;
	}

	public static int getHeight(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = getHeight(node.left) + 1;
		int right = getHeight(node.right) + 1;
		return Math.max(left, right);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		node1.left = new TreeNode(3);
		node1.right = new TreeNode(2);
		node1.left.left = new TreeNode(5);

		TreeNode node2 = new TreeNode(2);
		node2.left = new TreeNode(1);
		node2.right = new TreeNode(3);
		node2.left.right = new TreeNode(4);
		node2.right.right = new TreeNode(7);

		TreeNode result = mergeTrees(node1, node2);
		System.out.println(result.val);
		System.out.println(result.left.val);
		System.out.println(result.right.val);
		System.out.println(result.left.left.val);
		System.out.println(result.left.right.val);
		System.out.println(result.right.right.val);
	}
}
