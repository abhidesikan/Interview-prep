package com.abhidesikan.interviewprep.leetcode;

public class SplitLinkedListInParts {

	public static ListNode[] splitListToParts(ListNode root, int k) {

		ListNode[] arr = new ListNode[k];
		int partsize = findLength(root) / k;
		int rem = findLength(root) % k;


		for (int i = 0; i < k; i++) {
			ListNode head = root;

			for (int j = 0; j < partsize + (rem > i ? 1 : 0) - 1; j++) {
				root = root.next;
			}

			if (root != null) {
				ListNode temp = root;
				root = root.next;
				temp.next = null;
			}

			arr[i] = head;
		}

		return arr;
	}

	public static int findLength(ListNode node) {
		int count = 0;
		while (node != null) {
			node = node.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(4);
		node.next.next = new ListNode(5);
		ListNode arr[] = splitListToParts(node, 5);
		for(ListNode n : arr) {
			System.out.println(n.val);
		}

	}
}
