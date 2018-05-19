package com.abhidesikan.interviewprep.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	public static void printReverseLevelOrder(TreeNode root) {
		Stack<Integer> stack = new Stack();
		Queue<TreeNode> queue = new LinkedList<>();

		if (root == null) {
			return;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.right != null) {
				queue.add(node.right);
			}
			if (node.left != null) {
				queue.add(node.left);
			}
			stack.push(node.val);
		}

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
		node.right = new TreeNode(5);
		node.left.left = new TreeNode(8);
		node.left.right = new TreeNode(6);
		printReverseLevelOrder(node);
	}
}
