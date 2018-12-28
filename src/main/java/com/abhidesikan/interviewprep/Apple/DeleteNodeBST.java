package com.abhidesikan.interviewprep.Apple;

public class DeleteNodeBST {

	public static TreeNode deleteNode(TreeNode root, int key) {

		if (root == null) {
			return null;
		}

		if (key < root.val) {
			root.left = deleteNode(root.left, key);
		}
		else if (key > root.val) {
			root.right = deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			}
			else if (root.right == null) {
				return root.left;
			}

			TreeNode min = findMin(root.right);
			root.val = min.val;
			root.right = deleteNode(root.right, root.val);
		}

		return root;
	}

	public static TreeNode findMin(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(8);
		node.left = new TreeNode(5);
		node.right = new TreeNode(12);
		node.left.left = new TreeNode(3);
		node.right.left = new TreeNode(10);
		node.right.right = new TreeNode(18);
		System.out.println(deleteNode(node, 18).right.right.val);
	}
}
