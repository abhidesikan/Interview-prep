package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindLeaves {

	public static List<List<Integer>> findLeaves(TreeNode root) {

		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		height(root, list);
		return list;
	}

	public static int height(TreeNode node, List<List<Integer>> list) {

		if (node == null) {
			return -1;
		}

		int level = 1 + Math.max(height(node.left, list), height(node.right, list));

		if (list.size() < level + 1) {
			List<Integer> temp = new ArrayList();
			list.add(temp);
		}
		list.get(level).add(node.val);
		return level;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
		node.right = new TreeNode(6);
		node.left.left = new TreeNode(7);
		node.left.right = new TreeNode(8);

		System.out.println(findLeaves(node));
	}
}
