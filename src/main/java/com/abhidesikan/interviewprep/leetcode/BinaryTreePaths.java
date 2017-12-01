package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		if(root == null) {
			return list;
		}

		String s = "";

		return binaryTreePaths(root, list, s);
	}

	public static List<String> binaryTreePaths(TreeNode node, List<String> list, String s) {
		if(node == null) {
			return list;
		}
		s += node.val + "->";

		if(node.left == null && node.right == null) {
			s = s.substring(0, s.length()-2);
			list.add(s);
		}

		binaryTreePaths(node.left, list, s);
		binaryTreePaths(node.right, list, s);
		return list;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = null;
		node.left.right = new TreeNode(5);
		System.out.println(binaryTreePaths(node));
	}
}
