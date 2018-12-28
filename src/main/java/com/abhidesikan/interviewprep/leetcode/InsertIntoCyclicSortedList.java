package com.abhidesikan.interviewprep.leetcode;

public class InsertIntoCyclicSortedList {

	static class Node {
		public int val;
		public Node next;

		public Node() {
		}

		public Node(int _val, Node _next) {
			val = _val;
			next = _next;
		}
	}

	;

	public static Node insert(Node head, int insertVal) {

		Node cur = head;
		boolean inserted = false;

		if (head == null) {
			Node newNode = new Node(insertVal, null);
			newNode.next = newNode;
			return newNode;
		}

		do {
			if (insertHere(cur, insertVal)) {
				Node newNode = new Node(insertVal, cur.next);
				cur.next = newNode;
				inserted = true;
			}
			cur = cur.next;
		} while (cur != head && !inserted);

		if (cur == head) {
			Node newNode = new Node(insertVal, cur.next);
			cur.next = newNode;
			inserted = true;
		}
		return head;
	}


	public static boolean insertHere(Node cur, int insertVal) {
		return (cur.val <= insertVal && cur.next.val >= insertVal) || (cur.val > cur.next.val && (insertVal >= cur.val || insertVal <= cur.next.val));
	}

	public static void main(String[] args) {
		Node node = new Node(1, null);
		node.next = new Node(2, node);
		Node result = insert(node, 3);
		int count = 0;
		while(count < 4) {
			System.out.println(result.val);
			result = result.next;
			count++;
		}
	}
}
