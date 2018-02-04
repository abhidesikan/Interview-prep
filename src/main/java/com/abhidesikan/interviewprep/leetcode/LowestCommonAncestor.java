package com.abhidesikan.interviewprep.leetcode;

public class LowestCommonAncestor {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if(root == null || p == root || q == root) {
			return root;
		}

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if(left != null && right != null) {
			return root;
		}
		if(left != null) {
			return left;
		} else {
			return right;
		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
//		node.right = new TreeNode(5);

		System.out.println(lowestCommonAncestor(node, node, node.right).val);
	}

}
