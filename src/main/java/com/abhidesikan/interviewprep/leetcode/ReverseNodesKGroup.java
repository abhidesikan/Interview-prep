package com.abhidesikan.interviewprep.leetcode;

public class ReverseNodesKGroup {

	public static ListNode reverseKGroup(ListNode head, int k) {

		if (head == null) {
			return null;
		}


		int length = length(head);

		if (k > length) {
			return head;
		}

		int split = length / k;
		ListNode result = head;
		ListNode traverse = head;

		int temp = 0;
		while (temp < k) {
			traverse = traverse.next;
			temp++;
		}

		result = reverseNode(result, k);


		for (int i = 1; i < split; i++) {
			ListNode tempTrav = getTraverse(traverse, k);
			ListNode tempHead = traverse;
			head.next = reverseNode(traverse, k);
			traverse = tempTrav;
			head = tempHead;
		}

		head.next = traverse;

		return result;

	}

	public static ListNode getTraverse(ListNode node, int split) {
		if (node == null) {
			return null;
		}
		int temp = 0;
		while (node != null && temp < split) {
			node = node.next;
			temp++;
		}
		return node;
	}

	public static int length(ListNode node) {
		if (node == null) {
			return 0;
		}
		int length = 0;
		while (node != null) {
			node = node.next;
			length++;
		}
		return length;
	}

	public static ListNode reverseNode(ListNode node, int len) {
		if (node == null) {
			return null;
		}

		ListNode prev = null;
		ListNode cur = node;
		ListNode next;
		int temp = 0;
		while (cur != null && temp < len) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			temp++;
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(4);
		node.next.next = new ListNode(5);
		System.out.println(reverseKGroup(node, 2).val);

	}
}
