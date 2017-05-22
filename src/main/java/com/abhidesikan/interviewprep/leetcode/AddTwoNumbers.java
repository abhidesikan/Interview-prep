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
		while (l1 == null && l2 == null) {
			return null;
		}
		int carry = 0;
		List<Integer> numbers = new ArrayList<Integer>();
		while (l1 != null && l2 != null) {
			int sum = 0;
			sum += l1.val + l2.val;
			if (sum >= 10) {
				if (carry > 0) {
					sum = sum + carry;
					numbers.add(sum / 10);
				} else {
					numbers.add(sum % 10);
					carry = sum / 10;
				}
			} else {
				if (carry > 0) {
					sum = sum + carry;
				}
				numbers.add(sum);
				carry = 0;
			}
			l1 = l1.next; l2 = l2.next;
		}

		while (l1 != null) {
			if(carry > 0) {
				numbers.add(l1.val + carry);
				carry = 0;
			} else {
				numbers.add(l1.val);
			}
			l1 = l1.next;
		}

		while (l2 != null) {
			if(carry > 0) {
				numbers.add(l2.val + carry);
				carry = 0;
			} else {
				numbers.add(l2.val);
			}
			l2 = l2.next;
		}


		ListNode finalNode = null;
		ListNode head = null;

		for (int i = 0; i < numbers.size(); i++) {
			if (finalNode == null) {
				finalNode = addToNode(numbers.get(i), finalNode);
				head = finalNode;
			} else {
				finalNode = addToNode(numbers.get(i), finalNode);
			}
		}

		if (carry > 0) {
			ListNode node = new ListNode(carry);
			head.next = node;
		}
		return head;
	}

	public static ListNode addToNode(int val, ListNode actual) {
		if (actual == null) {
			actual = new ListNode(val);
		} else {
			actual.next = new ListNode(val);
			actual = actual.next;
		}
		return actual;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(5);
//		node.next = new ListNode(4);
//		node.next.next = new ListNode(3);

		ListNode node2 = new ListNode(5);
//		node2.next = new ListNode(6);
//		node2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(node, node2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}

