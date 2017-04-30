package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class PalindromeLinkedList {

	public static boolean checkPalindrome(DoublyLinkedList node) {
		StringBuilder builder = new StringBuilder();

		if (node == null) {
			return false;
		}
		builder.append(node.data);
		while(node.next!= null) {
			builder.append(node.next.data);
			node = node.next;
		}
		String a = builder.toString();
		System.out.println(a);

		builder = new StringBuilder();
		builder.append(node.data);
		while (node.prev != null) {
			builder.append(node.prev.data);
			node = node.prev;
		}
		String b = builder.toString();
		System.out.println(b);

		if(a.equals(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		DoublyLinkedList node = new DoublyLinkedList('a');
		node.prev = null;
		node.next = new DoublyLinkedList('n');
		node.next.prev = node;
		node.next.next = new DoublyLinkedList('n');
		node.next.next.prev = node.next;
		node.next.next.next = new DoublyLinkedList('a');
		node.next.next.next.prev = node.next.next;
		node.next.next.next.next = null;
		System.out.println(checkPalindrome(node));
	}
}
