package com.abhidesikan.interviewprep.leetcode;

public class RotateList {

	public ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null) return head;

		ListNode copyHead = head;

		int len = 1;

		while (copyHead.next != null) {
			copyHead = copyHead.next;
			len++;
		}

		copyHead.next = head;

		for (int j = len - n % len; j > 1; j--) {
			head = head.next;
		}
		copyHead = head.next;

		head.next = null;

		return copyHead;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		System.out.println(new RotateList().rotateRight(node, 1).next.next.val);
	}
}
