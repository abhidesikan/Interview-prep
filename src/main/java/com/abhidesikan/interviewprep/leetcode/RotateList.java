package com.abhidesikan.interviewprep.leetcode;

import java.util.List;

public class RotateList {

	public ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy, slow = dummy;

		int i;
		for (i = 0; fast.next != null; i++) {
			fast = fast.next;
		}

		System.out.println("i value " + i);
		System.out.println(i-n%i);
		for (int j = i - n % i; j > 0; j--) {
			slow = slow.next;
		}

		System.out.println(slow.val + " slow");
		System.out.println(fast.val + " fast");
		System.out.println(dummy.next.val + " dummy");

		fast.next = dummy.next;
		System.out.println("dumm next val before " + dummy.next.val);
		dummy.next = slow.next;
		System.out.println("dumm next val after " + dummy.next.val);

		System.out.println(dummy.val + " dummy val");
		System.out.println(slow.val + " slow val");

		slow.next = null;

		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		System.out.println(new RotateList().rotateRight(node, 2).val);
	}
}
