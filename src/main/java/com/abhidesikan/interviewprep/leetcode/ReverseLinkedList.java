package com.abhidesikan.interviewprep.leetcode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode next = null;
		ListNode cur = head;
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
}
