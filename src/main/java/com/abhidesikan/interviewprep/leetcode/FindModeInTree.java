package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 7/11/17.
 */
public class FindModeInTree {

	HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

	public int[] findMode(TreeNode root) {
		if(root == null) {
			return new int[0];
		}

		inOrder(root);

		int max = Integer.MIN_VALUE;
		int maxCount = 0;
		System.out.println(map);

		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if((Integer)pair.getValue() > (Integer)maxCount) {
				max = (Integer)pair.getKey();
				maxCount = (Integer) pair.getValue();
			}
		}

		Iterator it2 = map.entrySet().iterator();
		List<Integer> list = new ArrayList<Integer>();

		while(it2.hasNext()) {
			Map.Entry pair = (Map.Entry)it2.next();
			if((Integer)pair.getValue() == maxCount) {
				list.add((Integer)pair.getKey());
			}
		}

		int arrFinal[] = new int[list.size()];
		for(int i=0; i<arrFinal.length; i++) {
			arrFinal[i] = list.get(i);
		}
		return arrFinal;
	}

	public void inOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		if(map.containsKey(node.val)) {
			map.put(node.val, map.get(node.val) + 1);
		} else {
			map.put(node.val, 1);
		}
		inOrder(node.right);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(-4);
		node.left = new TreeNode(-5);
//		node.left.right = new TreeNode(2);
		node.right = new TreeNode(-4);
//		node.right.left = new TreeNode(1);
//		node.right.left.left = new TreeNode(1);
		System.out.println(Arrays.toString(new FindModeInTree().findMode(node)));

	}
}
