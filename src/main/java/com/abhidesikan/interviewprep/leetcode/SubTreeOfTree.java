package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 7/8/17.
 */
public class SubTreeOfTree {

	public static boolean isSubtree(TreeNode s, TreeNode t) {

		if (s == null) {
			return false;
		}

		if (isSame(s, t)) {
			return true;
		}

		return isSubtree(s.left, t) || isSubtree(s.right, t);
	}

	public static boolean isSame(TreeNode s, TreeNode t) {
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}

		if (s.val != t.val) {
			return false;
		}
		return isSame(s.left, t.left) && isSame(s.right, t.right);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(2);
		node.right = new TreeNode(1);
		TreeNode sub = new TreeNode(2);
		System.out.println(isSubtree(node, sub));
	}
}
