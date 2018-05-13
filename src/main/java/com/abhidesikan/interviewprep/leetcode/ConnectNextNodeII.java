package com.abhidesikan.interviewprep.leetcode;

public class ConnectNextNodeII {

	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	public static void connect(TreeLinkNode root) {

		connect(root, null);
	}

	public static void connect(TreeLinkNode root, TreeLinkNode right) {
		if (root == null) {
			return;
		}
		root.next = right;
		TreeLinkNode nextRight = findNextRight(right);
		connect(root.right, nextRight);
		connect(root.left, root.right != null ? root.right : nextRight);
	}


	public static TreeLinkNode findNextRight(TreeLinkNode node) {
		if (node == null) {
			return node;
		}
		if (node.left != null) {
			return node.left;
		}
		if (node.right != null) {
			return node.right;
		}
		return findNextRight(node.next);
	}

	public static void main(String[] args) {
		TreeLinkNode node = new TreeLinkNode(1);
		node.left = new TreeLinkNode(2);
		node.right = new TreeLinkNode(3);
		connect(node);
		System.out.println(node.left.next.val);

	}
}
