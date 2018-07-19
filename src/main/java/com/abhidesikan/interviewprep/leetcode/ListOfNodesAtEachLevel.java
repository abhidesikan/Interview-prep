package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfNodesAtEachLevel {

	public static void createLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {

		if (root == null) {
			return;
		}

		LinkedList<TreeNode> list = null;
		System.out.println(lists.size() + " size " + " " + level);
		if (lists.size() == level) {
			System.out.println("in if");
			list = new LinkedList<>();
			lists.add(list);
			for(LinkedList<TreeNode> temp : lists) {
				for(TreeNode tmp : temp) {
					System.out.println(tmp.val);
				}
			}
		} else {
			System.out.println(" in else");
			list = lists.get(level);
		}
		list.add(root);
		createLinkedList(root.left, lists, level+1);
		createLinkedList(root.right, lists, level+1);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		createLinkedList(node, new ArrayList<LinkedList<TreeNode>>(), 0);
	}

}
