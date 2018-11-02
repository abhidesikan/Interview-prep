package com.abhidesikan.interviewprep.leetcode;

import java.util.PriorityQueue;

public class KthLargestElementInStream {


	int k;
	PriorityQueue<Integer> queue;

	public KthLargestElementInStream(int k, int[] nums) {
		this.k = k;
		queue = new PriorityQueue();
		for (int i : nums) {
			add(i);
		}
	}

	public int add(int val) {
		if (queue.size() < k) {
			queue.add(val);
		} else if (queue.peek() < val) {
			queue.poll();
			queue.add(val);
		}

		return queue.peek();
	}

	public static void main(String[] args) {
		KthLargestElementInStream k = new KthLargestElementInStream(3, new int[]{4,5,2,8});
		System.out.println(k.add(7));
	}
}
