package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class ZigZagLevelOrder {
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if(root == null) {
			return result;
		}

		List<Integer> temp = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		int level = 1;
		while(!q.isEmpty()) {
			TreeNode node = q.remove();
			if(node == null) {
				if(level % 2 == 0) {
					Collections.reverse(temp);
				}
				result.add(temp);
				temp = new ArrayList<>();
				level++;
				if (!q.isEmpty()) q.add(null);
			} else {
				temp.add(node.val);
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
		node.right = new TreeNode(5);
		System.out.println(zigzagLevelOrder(node));
	}
}
