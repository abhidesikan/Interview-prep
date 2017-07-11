package com.abhidesikan.interviewprep.leetcode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by abhidesikan on 7/9/17.
 */
public class GreaterTree {

	int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		if(root == null) {
			return null;
		}

		convertBST(root.right);
		System.out.println(root.val + " root");

		root.val += sum;
		sum = root.val;
		System.out.println(sum + " sum");
		convertBST(root.left);
		return root;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(2);
		node.right = new TreeNode(13);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);


		TreeNode finalNode = new GreaterTree().convertBST(node);
		System.out.println(finalNode.val);
		System.out.println(finalNode.left.val);
		System.out.println(finalNode.right.val);
		System.out.println(finalNode.left.left.val);
		System.out.println(finalNode.left.right.val);


	}
}
