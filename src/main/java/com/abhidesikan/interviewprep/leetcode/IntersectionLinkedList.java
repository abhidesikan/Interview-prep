package com.abhidesikan.interviewprep.leetcode;

public class IntersectionLinkedList {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = findLength(headA);
		int lengthB = findLength(headB);
		int diff = Math.abs(lengthA - lengthB);


		if(lengthA > lengthB) {
			headA = moveForward(headA, diff);
		} else {
			headB = moveForward(headB, diff);
		}

		while(headA != null) {
			if(headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	public static ListNode moveForward(ListNode node, int diff) {
		if(node == null) {
			return null;
		}
		while(diff != 0) {
			node = node.next;
			diff--;
		}
		return node;
	}

	public static int findLength(ListNode node) {
		int length = 0;
		if(node == null) {
			return 0;
		}

		while(node != null) {
			node = node.next;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(4);
	}
}
