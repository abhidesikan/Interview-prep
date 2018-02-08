package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 7/18/17.
 */
public class MostFrequentSubTreeSum {

	static HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
	static int maxFreq = 0;

	public static int[] findFrequentTreeSum(TreeNode root) {

		if(root == null) {
			return new int[0];
		}

		postOrder(root);
		List<Integer> list = new ArrayList();

		for(int key : sumMap.keySet()) {
			if(sumMap.get(key) == maxFreq) {
				list.add(key);
			}
		}

		int[] arr = list.stream().mapToInt(i -> i).toArray();

		return arr;
	}

	public static int postOrder(TreeNode node) {
		if(node == null) {
			return 0;
		}

		int left = postOrder(node.left);
		int right = postOrder(node.right);
		int sum = node.val + left + right;
		if(sumMap.containsKey(sum)) {
			sumMap.put(sum, sumMap.get(sum) + 1);
		} else {
			sumMap.put(sum, 1);
		}
		maxFreq = Math.max(maxFreq, sumMap.get(sum));

		return sum;
	}


	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(2);
		node.right = new TreeNode(-3);
		System.out.println(Arrays.toString(new MostFrequentSubTreeSum().findFrequentTreeSum(node)));
	}
}
