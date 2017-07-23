package com.abhidesikan.interviewprep.leetcode;

public class BuildTreeFromInOrderPostOrder {

	int postIndex = 0;

	public TreeNode buildTree(int[] inorder, int[] postorder) {

		if (inorder.length < 1) {
			return null;
		}
		int start = 0;
		int end = inorder.length - 1;
		postIndex = postorder.length - 1;

		return buildTree(inorder, postorder, start, end);
	}

	public TreeNode buildTree(int[] inorder, int[] postorder, int start, int end) {

		if (start > end) {
			return null;
		}
		TreeNode node = new TreeNode(postorder[postIndex--]);

		if (start == end) {
			return node;
		}

		int index = search(inorder, start, end, node.val);
		node.right = buildTree(inorder, postorder, index + 1, end);
		node.left = buildTree(inorder, postorder, start, index - 1);

		return node;
	}

	public int search(int[] in, int start, int end, int val) {

		for (int i = start; i <= end; i++) {
			if (in[i] == val) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] inOrder = {2, 1, 3};
		int[] postOrder = {1, 3, 2};

		System.out.println(new BuildTreeFromInOrderPostOrder().buildTree(inOrder, postOrder).val);
	}
}
