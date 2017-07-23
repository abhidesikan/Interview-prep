package com.abhidesikan.interviewprep.leetcode;

public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
			return true;
		}

		if(p == null || q == null) {
			return false;
		}

		if(p.val != q.val) {
			return false;
		}

		return isSameTree(p.left , q.left) && isSameTree(p.right,q.right);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		TreeNode copy = node;

		System.out.println(new IsSameTree().isSameTree(node, copy));
	}
}
