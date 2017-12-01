package com.abhidesikan.interviewprep.leetcode;

import java.util.HashSet;

public class FindTarget {

	public static boolean findTarget(TreeNode root, int k) {
		HashSet<Integer> set = new HashSet();
		return findTarget(root, set, k);
	}

	public static boolean findTarget(TreeNode node, HashSet set, int k) {
		if(node == null) {
			return false;
		}
		if(set.contains(k - node.val)) {
			return true;
		}
		set.add(node.val);
		return findTarget(node.left, set, k) || findTarget(node.right, set, k);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(3);
		node.right = new TreeNode(6);
		node.left.left = new TreeNode(2);
		node.left.right = new TreeNode(4);
		node.right.right = new TreeNode(7);

		System.out.println(findTarget(node, 9));
	}
}
