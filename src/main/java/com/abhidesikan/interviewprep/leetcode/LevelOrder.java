package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();

		if(root == null) {
			return list;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		List<Integer> listInner = new ArrayList();

		while(!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			if(temp != null) {
				listInner.add(temp.val);
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}
			}
			if(temp == null && !queue.isEmpty()) {
				list.add(listInner);
				listInner = new ArrayList();
				queue.add(null);
			}
		}
		if(listInner.size() > 0) {
			list.add(listInner);
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(4);
		node.right = new TreeNode(5);
		node.right.right = new TreeNode(6);
		System.out.println(levelOrder(node));
	}
}
