package com.abhidesikan.interviewprep.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

	public static ListNode mergeKLists(ListNode[] lists) {

		if (lists.length == 0) {
			return null;
		}

		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				if (o1.val < o2.val) {
					return -1;
				} else if (o1.val > o2.val) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;

		for (ListNode node : lists) {
			if(node != null) {
				pq.add(node);
			}
		}

		while (!pq.isEmpty()) {
			temp.next = pq.poll();
			temp = temp.next;
			if(temp.next != null) {
				pq.add(temp.next);
			}
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(3);

		ListNode node1 = new ListNode(2);
		node1.next = new ListNode(4);

		ListNode [] arr = new ListNode[2];
		arr[0] = node;
		arr[1] = node1;

		ListNode result = mergeKLists(arr);

		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
