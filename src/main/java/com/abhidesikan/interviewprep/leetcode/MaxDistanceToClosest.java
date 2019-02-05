package com.abhidesikan.interviewprep.leetcode;

public class MaxDistanceToClosest {

	public static int maxDistToClosest(int[] seats) {

		int left = -1;
		int max = 0;

		for (int i = 0; i < seats.length; i++) {

			if (seats[i] == 0) {
				continue;
			}

			if (left == -1) {
				max = Math.max(max, i);
			} else {
				max = Math.max(max, (i - left) / 2);
			}
			left = i;
		}

		if (seats[seats.length - 1] == 0) {
			max = Math.max(max, seats.length - 1 - left);
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxDistToClosest(new int[] {0,0,1,1,0,1,0,0,0}));
	}
}
