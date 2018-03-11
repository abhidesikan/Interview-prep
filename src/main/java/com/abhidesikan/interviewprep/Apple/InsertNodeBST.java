package com.abhidesikan.interviewprep.Apple;

public class InsertNodeBST {


	public static TreeNode createNode(int val) {
		TreeNode node = new TreeNode(val);
		return node;
	}

	public static TreeNode insert(TreeNode rootNode, int value) {
		if(rootNode == null) {
			return createNode(value);
		}
		System.out.println(rootNode.val);

		if (value > rootNode.val) {
			if(rootNode.right != null) {
				return insert(rootNode.right, value);
			} else {
				rootNode.right = createNode(value);
				System.out.println("Creating node at right of " + rootNode.val);
				return rootNode.right;
			}
		} else {
			if(rootNode.left != null) {
				return insert(rootNode.left, value);
			} else {
				rootNode.left = createNode(value);
				return rootNode.left;
			}
		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(6);
		node.left = new TreeNode(3);
		node.right = new TreeNode(7);
		node.right.right = new TreeNode(9);
		System.out.println(insert(node, 8).val);
	}
}
