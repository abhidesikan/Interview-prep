package com.abhidesikan.interviewprep.leetcode;

public class HasCycle {
	public static boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;

		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}
