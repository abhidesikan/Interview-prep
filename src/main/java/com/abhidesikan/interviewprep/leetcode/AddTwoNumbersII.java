package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class AddTwoNumbersII {


	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		while(l1 != null) {
			s1.add(l1.val);
			l1 = l1.next;
		}

		while(l2 != null) {
			s2.add(l2.val);
			l2 = l2.next;
		}

		int size = s1.size() > s2.size() ? s2.size() : s1.size();
		boolean flag =  s1.size() > s2.size() ? true : false;

		ListNode sentinel = null;
		int carry = 0;
		while(size > 0) {
			int sum = s1.pop() + s2.pop() + carry;
			carry = sum /10 ;
			ListNode node = new ListNode(sum % 10);
			node.next = sentinel;
			sentinel = node;
			size--;
		}

		if(flag) {
			while(!s1.isEmpty()) {
				int sum = s1.pop();
				if(carry == 1) {
					sum += carry;
					if(sum != 10) {
						carry = 0;
					} else {
						sum = 0;
					}
				}
				ListNode node = new ListNode(sum);
				node.next = sentinel;
				sentinel = node;
			}
		} else {
			while(!s2.isEmpty()) {
				int sum = s2.pop();
				if(carry == 1) {
					sum += carry;
					if(sum != 10) {
						carry = 0;
					} else {
						sum = 0;
					}
				}
				ListNode node = new ListNode(sum);
				node.next = sentinel;
				sentinel = node;
			}
		}

		if(carry > 0) {
			ListNode node = new ListNode(carry);
			node.next = sentinel;
			sentinel = node;
		}
		return sentinel;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(4);
		ListNode node1 = new ListNode(3);
		System.out.println(addTwoNumbers(node1, node).val);
	}
}
