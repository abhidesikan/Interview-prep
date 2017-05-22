package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhidesikan on 5/21/17.
 */
public class AddTwoNumbers {

	/* Definition for singly-linked list. */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode c1 = l1;
		ListNode c2 = l2;
		ListNode sentinel = new ListNode(0);
		ListNode d = sentinel;
		int sum = 0;
		while (c1 != null || c2 != null) {
			sum /= 10;
			if (c1 != null) {
				sum += c1.val;
				c1 = c1.next;
			}
			if (c2 != null) {
				sum += c2.val;
				c2 = c2.next;
			}
			d.next = new ListNode(sum % 10);
			d = d.next;
		}
		if (sum / 10 == 1) {
			d.next = new ListNode(1);
		}
		return sentinel.next;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(9);
		node.next = new ListNode(9);
		node.next.next = new ListNode(9);

		ListNode node2 = new ListNode(9);
		node2.next = new ListNode(9);
		node2.next.next = new ListNode(9);

		ListNode result = addTwoNumbers(node, node2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}

