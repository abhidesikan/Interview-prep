package com.abhidesikan.interviewprep.Apple;

public class DeleteNodeBST {

	public static TreeNode deleteNode(TreeNode rootNode, int value) {
		if(rootNode == null) {
			return null;
		}
		if(rootNode.val == value) {
			TreeNode temp = rootNode;
			if(rootNode.left == null && rootNode.right == null) {
				return rootNode;
			}
			if(rootNode.left != null) {
				rootNode = rootNode.left;
				while (rootNode.right != null) {
					rootNode = rootNode.right;
				}
				rootNode.right = temp.right;
				return rootNode;
			}
			if(rootNode.right != null) {
				return rootNode.right;
			}
			return rootNode;
		}
		if(value < rootNode.val) {
			rootNode.left =  deleteNode(rootNode.left, value);
		} else {
			rootNode.right =  deleteNode(rootNode.right, value);
		}
		return rootNode;
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
