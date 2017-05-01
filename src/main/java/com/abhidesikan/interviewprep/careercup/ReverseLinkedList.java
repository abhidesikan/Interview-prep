package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/30/17.
 */
public class ReverseLinkedList {

	public static LinkedList reverseList(LinkedList head) {
		LinkedList prev = null;
		LinkedList next = null;
		if(head == null) {
			return null;
		}
		LinkedList cur = head;
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedList head = new LinkedList(1);
		head.next = new LinkedList(2);
		head.next.next = new LinkedList(3);
		System.out.println(reverseList(head).data);
	}
}
