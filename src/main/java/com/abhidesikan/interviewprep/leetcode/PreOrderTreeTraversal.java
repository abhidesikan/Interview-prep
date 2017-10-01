package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTreeTraversal {

	List<Integer> list = new ArrayList<>();

	public List<Integer> preorderTraversal(TreeNode root) {

		if (root == null) {
			return list;
		}
		list.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		return list;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(4);
		System.out.println(new PreOrderTreeTraversal().preorderTraversal(node));
	}
}
