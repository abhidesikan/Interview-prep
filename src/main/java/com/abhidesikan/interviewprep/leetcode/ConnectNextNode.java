package com.abhidesikan.interviewprep.leetcode;

public class ConnectNextNode {

	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	public static void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}

		if (root.left != null) {
			root.left.next = root.right;
			if (root.next != null) {
				root.right.next = root.next.left;
			}
		}
		connect(root.left);
		connect(root.right);
	}

	public static void main(String[] args) {
		TreeLinkNode node = new TreeLinkNode(1);
		node.left = new TreeLinkNode(2);
		node.right = new TreeLinkNode(3);
		connect(node);
		System.out.println(node.left.next.val);

	}

}
