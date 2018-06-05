package com.abhidesikan.interviewprep.leetcode;

public class LowestCommonAncestorBinarySearchTree {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if(root == null || p == root || q == root) {
			return root;
		}

		if(p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else if(p.val > root.val && q.val > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else {
			return root;
		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
		node.right = new TreeNode(5);
		node.left.left = new TreeNode(2);
		node.left.right = new TreeNode(6);

		System.out.println(lowestCommonAncestor(node, node.left.left, node.left.right).val);
	}
}
