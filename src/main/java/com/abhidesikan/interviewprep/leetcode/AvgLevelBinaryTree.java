package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 7/8/17.
 */
public class AvgLevelBinaryTree {


	public static List<Double> averageOfLevels(TreeNode node) {

		List<Double> result = new ArrayList<Double>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.offer(node);

		while (!queue.isEmpty()) {
			int n = queue.size();
			System.out.println("queue size " + n);
			double sum = 0;
			for (int i = 0; i < n; i++) {
				TreeNode temp = queue.poll();
				System.out.println("node " + temp.val);
				sum += temp.val;
				if (temp.left != null) {
					queue.offer(temp.left);
				}
				if (temp.right != null) {
					queue.offer(temp.right);
				}
			}
			result.add(sum / n);
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(1);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(10);
		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(4);
		node.right.left = new TreeNode(6);
		node.right.right = new TreeNode(7);

		System.out.println(averageOfLevels(node));
	}
}
