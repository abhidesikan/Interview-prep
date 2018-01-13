package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeTree {
	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {
		StringBuilder serialized = new StringBuilder();
		in(root, serialized);
		return serialized.toString();
	}

	private static void in(TreeNode node, StringBuilder serialized) {
		if (node == null) {
			serialized.append("xxx,");
			return;
		} else {
			serialized.append(node.val + ",");
			in(node.left, serialized);
			in(node.right, serialized);
		}
	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {
		return out(new LinkedList<>(Arrays.asList(data.split(","))));
	}

	private static TreeNode out(Queue<String> q) {
		String value = q.remove();
		TreeNode node;
		if (value.equals("xxx")) {
			return null;
		} else {
			node = new TreeNode(Integer.parseInt(value));
			node.left = out(q);
			node.right = out(q);
		}
		return node;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);

		System.out.println( serialize(deserialize(serialize(node))));
	}
}
