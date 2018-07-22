package com.abhidesikan.interviewprep.leetcode;

public class InOrderSuccesor {


	public static TreeNode inOrderSuccesor(TreeNode root, TreeNode target) {

		if (root == null) {
			return null;
		}

		TreeNode current = root;
		TreeNode parent = null;

		while (current != null) {
			if (current.val < target.val) {
				current = current.right;
			} else if (current.val > target.val) {
				parent = current;
				current = current.left;
			} else {
				if(current.right == null) {
					return parent;
				} else {
					TreeNode temp = current.right;
					while(temp.left != null) {
						temp = temp.left;
					}
					return temp;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(2);
		node.right = new TreeNode(5);
		System.out.println(inOrderSuccesor(node, new TreeNode(3)).val);
	}
}
