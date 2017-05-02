package com.abhidesikan.interviewprep.careercup;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class MaxElementsAtLevel {

	static int maxCount = 0;
	static int levelCount = 0;


	public static int returnMaxElementsCount(Node node) {
		if(node == null) {
			return 0;
		}
		int height = findMaxHeight(node);
		for(int i=1; i<=height; i++) {
			levelCount = 0;
			findMaxCountAtLevel(node, i);
		}
		return maxCount;
	}

	public static int findMaxHeight(Node node) {
		if(node == null) {
			return 0;
		}
		return Math.max(findMaxHeight(node.left)+1, findMaxHeight(node.right)+1);
	}

	public static int findMaxCountAtLevel(Node node, int level) {
		if(node == null) {
			return 0;
		}
		if(level == 1) {
			levelCount++;
		} else {
			findMaxCountAtLevel(node.left, level-1);
			findMaxCountAtLevel(node.right, level-1);
		}
		if(maxCount < levelCount) {
			maxCount = levelCount;
		}
		return maxCount;
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
//		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(7);
		node.right.right = new Node(9);
		System.out.println(returnMaxElementsCount(node));
	}
}
