package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class LongestSequenceTree {

	static int maxLen = 0;

	public static int printLongestSequence(Node node) {
		if(node == null) {
			return 0;
		}
		int currentPath = 1;
		return Math.max(printLongestSequence(node.left, currentPath, node.data+1),printLongestSequence(node.right, currentPath, node.data+1));
	}

	public static int printLongestSequence(Node node, int path, int data) {
		if(node == null) {
			return path;
		}

		if(node.data == data) {
			path = Math.max(printLongestSequence(node.left, path+1, data+1), printLongestSequence(node.right, path+1, data+1));
			maxLen = Math.max(path, maxLen);
		} else {
			path = 1;
			data = node.data;
			path = Math.max(printLongestSequence(node.left, path, data+1), printLongestSequence(node.right, path, data+1));
			maxLen = Math.max(path, maxLen);
		}

		return maxLen;
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.left.right = new Node(3);
		node.left.left = new Node(3);
		node.left.left.left = new Node(4);
		node.left.left.left.right = new Node(5);
		node.right = new Node(4);
		node.right.left = new Node(5);
		node.right.left.right = new Node(6);
		node.right.left.right.right = new Node(7);

		System.out.println(printLongestSequence(node));
	}
}
