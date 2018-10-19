package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class JumpGameII {

	public int jump(int[] nums) {

		if (nums.length <= 1) {
			return 0;
		}

		int target = nums.length - 1;
		int steps = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		Set<Integer> visited = new HashSet<>();

		queue.add(0);
		queue.add(-1);
		visited.add(0);

		while (!queue.isEmpty()) {
			int index = queue.remove();
			if (index == -1 && !queue.isEmpty()) {
				steps++;
				queue.add(-1);
				continue;
			}
			int val = nums[index];
			for (int i = val; i >= 1; i--) {
				if (index + i == target) {
					return ++steps;
				} else {
					if (!visited.contains(index + i)) {
						queue.add(index + i);
						visited.add(index + i);
					}
				}
			}
		}
		return steps;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new int[] {2,3,1,1,4}));
	}
}
