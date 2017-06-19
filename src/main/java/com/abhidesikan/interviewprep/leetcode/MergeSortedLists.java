package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/18/17.
 */
public class MergeSortedLists {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		int beg = 0;
		if (l1.val <= l2.val) {
			beg = l1.val;
			l1 = l1.next;
		} else {
			beg = l2.val;
			l2 = l2.next;
		}
		ListNode finalList = new ListNode(beg);
		ListNode result = finalList;
		while (l1 != null && l2 != null) {
			finalList.next = new ListNode(Math.min(l1.val, l2.val));
			finalList = finalList.next;
			if (l1.val < l2.val) {
				l1 = l1.next;
			} else {
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			while (l1 != null) {
				finalList.next = new ListNode(l1.val);
				finalList = finalList.next;
				l1 = l1.next;
			}
		} else {
			while (l2 != null) {
				finalList.next = new ListNode(l2.val);
				finalList = finalList.next;
				l2 = l2.next;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(1);
		node2.next = new ListNode(2);
		node2.next.next = new ListNode(4);
		ListNode result = mergeTwoLists(node1, node2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
