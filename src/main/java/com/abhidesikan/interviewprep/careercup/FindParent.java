package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 5/1/17.
 */
public class FindParent {

	public static int findParent(Node node, int val) {

		if(node == null) {
			return -1;
		}
		if(node.left != null) {
			if(node.left.data == val) {
				return node.data;
			}
		}
		if(node.right != null) {
			if (node.right.data == val) {
				return node.data;
			}
		}
		int i = findParent(node.left, val);
		if(i > -1) {
			return i;
		}
		findParent(node.right, val);
		int j = findParent(node.left, val);
		if(j > -1) {
			return j;
		}

		return -1;
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		System.out.println(findParent(node, 3));
	}
}
