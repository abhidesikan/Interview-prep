package com.abhidesikan.interviewprep.leetcode;

import java.util.List;

/**
 * Created by abhidesikan on 6/20/17.
 */
public class RemoveFromEndOfList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode orig = head;
		ListNode iter = head;

		int length = 0;
		if (head == null) {
			return null;
		}
		while (head != null) {
			length++;
			head = head.next;
		}
		System.out.println("length " + length);

		if (n == length) {
			orig = orig.next;
			return orig;
		} else if (n == 0) {
			while (iter.next.next != null) {
				iter = iter.next;
			}
			iter.next = null;
			return orig;
		}
		int count = 0;
		while ((count + n != length - 1)) {
			count++;
			iter = iter.next;
		}
		if (iter.next != null) {
			iter.next = iter.next.next;
		}
		return orig;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		ListNode result = removeNthFromEnd(node, 3);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
