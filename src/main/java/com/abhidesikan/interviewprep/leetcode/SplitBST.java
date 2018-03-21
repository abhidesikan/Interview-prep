package com.abhidesikan.interviewprep.leetcode;

public class SplitBST {

	public static TreeNode[] splitBST(TreeNode root, int V) {

		TreeNode[] result = new TreeNode[2];

		if(root == null) {
			return result;
		}

		if(root.val <= V) {
			result[0] = root;
			TreeNode [] right = splitBST(root.right, V);
			root.right = right[0];
			result[1] = right[1];
		} else {
			result[1] = root;
			TreeNode [] left = splitBST(root.left, V);
			root.left = left[1];
			result[0] = left[0];
		}

		return result;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(6);
		System.out.println(splitBST(node, 4)[0].val);
	}
}
