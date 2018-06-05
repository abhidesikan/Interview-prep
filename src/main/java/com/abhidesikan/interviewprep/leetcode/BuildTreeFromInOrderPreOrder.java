package com.abhidesikan.interviewprep.leetcode;

public class BuildTreeFromInOrderPreOrder {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int start = 0;
		int end = preorder.length - 1;

		if (preorder.length == 0) {
			return null;
		}
		return buildTree(preorder, inorder, start, end);
	}

	int preIndex = 0;

	public TreeNode buildTree(int[] pre, int[] in, int start, int end) {

		if (start > end) {
			return null;
		}

		TreeNode node = new TreeNode(pre[preIndex++]);

		if (start == end) {
			return node;
		}

		int index = search(in, start, end, node.val);

		node.left = buildTree(pre, in, start, index - 1);
		node.right = buildTree(pre, in, index + 1, end);

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
		int[] inOrder = {2, 1};
		int[] preOrder = {1, 2};

		System.out.println(new BuildTreeFromInOrderPreOrder().buildTree(preOrder, inOrder).val);
	}
}
