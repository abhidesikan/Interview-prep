package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/6/17.
 */
public class MaxArea {

	public int maxArea(int[] height) {

		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		int x1 = 0;
		int x2 = 0;

		for (int i = 0; i < height.length; i++) {
			if (height[i] > min) {
				min = height[i];
				x1 = i;
			}
			if (height[i] < max) {
				max = height[i];
			}
		}
		int length = max-min;

		return 0;
	}
}
