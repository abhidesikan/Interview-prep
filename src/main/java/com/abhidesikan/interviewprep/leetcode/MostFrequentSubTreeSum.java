package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 7/18/17.
 */
public class MostFrequentSubTreeSum {

	HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

	public int[] findFrequentTreeSum(TreeNode root) {
		if (root == null) {
			return new int[0];
		}
		inOrder(root);
		System.out.println("final map "+ sumMap);
		int count = 0;
		Iterator it = sumMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if ((Integer) pair.getValue() > count) {
				count = (Integer) pair.getValue();
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		it = sumMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if ((Integer) pair.getValue() == count) {
				list.add((Integer)pair.getKey());
			}
		}
		int arr[] = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

	public void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		int sum = findSubTreeSums(node);
		if (sumMap.containsKey(sum)) {
			int curSum = sumMap.get(sum);
			sumMap.put(sum, curSum + 1);
		} else {
			sumMap.put(sum, 1);
		}
		System.out.println("current map "+sumMap);
		inOrder(node.right);
	}


	public int findSubTreeSums(TreeNode node) {

		if (node == null) {
			return 0;
		}
		return node.val + findSubTreeSums(node.left) + findSubTreeSums(node.right);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(2);
		node.right = new TreeNode(-3);
		System.out.println(Arrays.toString(new MostFrequentSubTreeSum().findFrequentTreeSum(node)));
	}
}
