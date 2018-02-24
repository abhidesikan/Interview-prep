package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by abhidesikan on 7/11/17.
 */
public class LargestValueAtLevel {

	public List<Integer> largestValues(TreeNode root) {

		List<Integer> maxList = new ArrayList<Integer>();

		if (root == null) {
			return maxList;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int n = queue.size();
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				TreeNode node = queue.poll();
				int temp = node.val;
				if (temp > max) {
					max = temp;
				}
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			maxList.add(max);
		}
		return maxList;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		System.out.println(new LargestValueAtLevel().largestValues(node));
	}
}
