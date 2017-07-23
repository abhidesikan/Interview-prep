package com.abhidesikan.interviewprep.leetcode;

public class DeleteDuplicatesDistinct {

	public ListNode deleteDuplicatesDistinct(ListNode head) {
		if(head == null) {
			return null;
		}

		ListNode dummy = new ListNode(0);

		ListNode slow = dummy; ListNode fast = head;
		slow.next = fast;

		while(fast != null) {
			while(fast.next != null && fast.next.val == fast.val) {
				fast = fast.next;
			}

			if(slow.next != fast) {
				slow.next = fast.next;
				fast = slow.next;
			} else {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(3);
		System.out.println(new DeleteDuplicatesDistinct().deleteDuplicatesDistinct(node).next.val);
	}
}
