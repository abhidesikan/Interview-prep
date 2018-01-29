package com.abhidesikan.interviewprep.leetcode;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue();

		for (int num : nums) {
			queue.offer(num);

			if (queue.size() > k) {
				queue.poll();
			}
		}
		return queue.peek();
	}

	public static void main(String[] args) {
		System.out.println(findKthLargest(new int[]{2,3,5,6,7}, 2));
	}
}
