package com.abhidesikan.interviewprep.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by abhidesikan on 7/11/17.
 */
public class BottomLeftValueOfTree {

	public int findBottomLeftValue(TreeNode root) {

		if (root == null) {
			return 0;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			root = queue.poll();
			if (root.right != null) {
				queue.offer(root.right);
			}
			if (root.left != null) {
				queue.offer(root.left);
			}
		}
		return root.val;
	}


	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.left.right = new TreeNode(3);
		node.right = new TreeNode(4);
		node.right.left = new TreeNode(5);
		node.right.left.left = new TreeNode(6);
		System.out.println(new BottomLeftValueOfTree().findBottomLeftValue(node));
	}
}
