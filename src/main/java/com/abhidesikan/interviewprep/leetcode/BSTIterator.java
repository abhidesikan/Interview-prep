package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class BSTIterator {

	Stack<TreeNode> stack;

	public BSTIterator(TreeNode root) {
		stack = new Stack();
		fillStack(stack, root);
	}

	public void fillStack(Stack stack, TreeNode node) {
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
	}

	/**
	 * @return whether we have a next smallest number
	 */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/**
	 * @return the next smallest number
	 */
	public int next() {
		TreeNode temp = stack.pop();
		fillStack(stack, temp.right);
		return temp.val;
	}
}
