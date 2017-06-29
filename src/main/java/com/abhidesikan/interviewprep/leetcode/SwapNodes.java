package com.abhidesikan.interviewprep.leetcode;

import java.util.List;

/**
 * Created by abhidesikan on 6/28/17.
 */
public class SwapNodes {

	public static ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode n = head.next;
		head.next = swapPairs(head.next.next);
		n.next = head;

		return n;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		System.out.println(swapPairs(node).next.val);
	}
}
