package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {

		if(root  == null) {
			return 0;
		}
		int finalSum = 0;
		List<String> sumList = new ArrayList<>();
		sumNumbers(root, "", sumList);
		for(int i=0; i<sumList.size(); i++) {
			finalSum += Integer.parseInt(sumList.get(i));
		}
		return finalSum;
	}

	public void sumNumbers(TreeNode node, String cur, List<String> sumList) {
		if(node == null) {
			return;
		}
		cur += String.valueOf(node.val);
		if(node.left == null && node.right == null) {
			sumList.add(cur);
			cur.substring(0, cur.length()-1);
		}
		sumNumbers(node.left, cur, sumList);
		sumNumbers(node.right, cur, sumList);
		cur.substring(0,cur.length()-1);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(6);
		node.left = new TreeNode(7);
		node.right = new TreeNode(8);
		System.out.println(new SumRootToLeafNumbers().sumNumbers(node));
	}
}
