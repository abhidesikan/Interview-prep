package com.abhidesikan.interviewprep.leetcode;

public class PartitionList {

	public ListNode partition(ListNode head, int x) {

		ListNode dummy1 = new ListNode(0);
		ListNode dummy2 = new ListNode(0);
		ListNode less = dummy1;
		ListNode great = dummy2;

		if(head == null) {
			return null;
		}
		while(head != null) {
			if(head.val < x) {
				less.next = new ListNode(head.val);
				less = less.next;
			} else {
				great.next = new ListNode(head.val);
				great = great.next;
			}
			head = head.next;
		}
		great.next = null;
		less.next = dummy2.next;
		return dummy1.next;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(1);
		node.next.next = new ListNode(4);

		System.out.println(new PartitionList().partition(node, 2).val);
	}
}
