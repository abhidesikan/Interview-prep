package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindPathSumII {

	List<List<Integer>> finalList = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		if(root == null) {
			return finalList;
		}
		List<Integer> sumList = new ArrayList();
		pathSum(root, sum, 0, sumList);
		return finalList;
	}

	public void pathSum(TreeNode node, int sum, int runningSum, List<Integer> sumList) {
		if(node == null) {
			return;
		}
		runningSum += node.val;
		sumList.add(node.val);
		if(runningSum == sum && node.left == null && node.right == null) {
			finalList.add(new ArrayList<Integer>(sumList));
			sumList.remove(sumList.size()-1);
			return;
		}
		pathSum(node.left, sum, runningSum, sumList);
		pathSum(node.right, sum, runningSum, sumList);
		sumList.remove(sumList.size()-1);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(5);
		node.right = new TreeNode(5);
		System.out.println(new FindPathSumII().pathSum(node, 9));
	}
}


