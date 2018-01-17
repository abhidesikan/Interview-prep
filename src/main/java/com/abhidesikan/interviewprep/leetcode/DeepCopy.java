package com.abhidesikan.interviewprep.leetcode;


import java.util.HashMap;

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};

public class DeepCopy {

	public static RandomListNode copyRandomList(RandomListNode head) {

		if (head == null) {
			return null;
		}

		HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

		RandomListNode first = head;

		while (first != null) {
			RandomListNode node = new RandomListNode(first.label);
			map.put(first, node);
			first = first.next;
		}

		first = head;
		while (first != null) {
			map.get(first).next = map.get(first.next);
			map.get(first).random = map.get(first.random);
			first = first.next;
		}

		return map.get(head);
	}

	public static void main(String[] args) {
		RandomListNode node = new RandomListNode(3);

	}
}
