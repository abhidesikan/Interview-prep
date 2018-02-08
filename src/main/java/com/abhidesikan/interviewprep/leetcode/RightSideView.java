package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList();
		if(root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove();
			if(!queue.isEmpty() && queue.peek() == null) {
				list.add(node.val);
			}
			if(node == null) {
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			}
			if(node != null && node.left != null) {
				queue.add(node.left);
			}
			if(node != null && node.right != null) {
				queue.add(node.right);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(3);
		node.right = new TreeNode(5);
		System.out.println(rightSideView(node));
	}
}
