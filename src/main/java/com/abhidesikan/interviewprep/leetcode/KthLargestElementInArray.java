package com.abhidesikan.interviewprep.leetcode;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue();

		for (int num : nums) {
			queue.offer(num);
			System.out.println(queue);
			if (queue.size() > k) {
				queue.poll();
				System.out.println("after poll " + queue);
			}
		}
		return queue.peek();
	}

	public static void main(String[] args) {
		System.out.println(findKthLargest(new int[]{7,6,3,5,2}, 2));
	}
}
