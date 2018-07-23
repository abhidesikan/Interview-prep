package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class ConnectNextNodeZigZag {

	public static class TreeLinkNode {
		int val;
		ConnectNextNodeZigZag.TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	public static void connect(TreeLinkNode root) {

		if (root == null) {
			return;
		}

		Stack<TreeLinkNode> stack1 = new Stack<>();
		Stack<TreeLinkNode> stack2 = new Stack<>();

		stack1.push(root);

		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				TreeLinkNode temp = stack1.pop();
				if (!stack1.isEmpty()) {
					temp.next = stack1.peek();
					System.out.println("peek value s1 " + stack1.peek().val);
				}
				if (temp.left != null) {
					stack2.push(temp.left);
				}
				if (temp.right != null) {
					stack2.push(temp.right);
				}
			}

			while (!stack2.isEmpty()) {
				TreeLinkNode temp = stack2.pop();
				if (!stack2.isEmpty()) {
					temp.next = stack2.peek();
					System.out.println("peek value s2 " + stack2.peek().val);
				}
				if (temp.right != null) {
					stack1.push(temp.right);
				}
				if (temp.left != null) {
					stack1.push(temp.left);
				}
			}
		}
	}

	public static void main(String[] args) {
		TreeLinkNode node = new TreeLinkNode(1);
		node.left = new TreeLinkNode(2);
		node.right = new TreeLinkNode(3);
		node.left.left = new TreeLinkNode(4);
		node.left.right = new TreeLinkNode(5);
		node.right.right = new TreeLinkNode(6);
		connect(node);
		System.out.println(node.right.next.val);
		System.out.println(node.left.left.next.val);
		System.out.println(node.left.right.next.val);
	}
}
