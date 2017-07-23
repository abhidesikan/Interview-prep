package com.abhidesikan.interviewprep.leetcode;

public class DeleteDuplicates {

	public ListNode deleteDuplicates(ListNode head) {

		if(head == null) {
			return null;
		}

		ListNode copyHead = head;

		while(head != null && head.next != null) {
			if(head.next.val == head.val) {
				head.next = head.next.next;
				continue;
			}
			head = head.next;
		}

		return copyHead;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(1);
		System.out.println(new DeleteDuplicates().deleteDuplicates(node).next);
	}
}
