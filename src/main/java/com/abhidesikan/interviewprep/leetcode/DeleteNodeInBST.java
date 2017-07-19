package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by abhidesikan on 7/18/17.
 */
public class DeleteNodeInBST {


	public TreeNode deleteNode(TreeNode root, int key) {

		if (root == null) {
			return null;
		}

		if (key < root.val) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.val) {
			root.right = deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			TreeNode min = findMin(root.right);
			root.val = min.val;
			root.right = deleteNode(root.right, root.val);
		}

		return root;
	}

	public TreeNode findMin(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(1);
		node.right = new TreeNode(4);
		System.out.println(new DeleteNodeInBST().deleteNode(node, 1).val);
	}
}
