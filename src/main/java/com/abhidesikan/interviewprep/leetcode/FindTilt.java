package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 7/8/17.
 */
public class FindTilt {

	int result = 0;

	public int findTilt(TreeNode root) {
		postOrder(root);
		return result;
	}

	public int postOrder(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = postOrder(root.left);
		int right = postOrder(root.right);
		result += Math.abs(left - right);
		return left + right + root.val;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		System.out.println(new FindTilt().findTilt(node));
	}
}
