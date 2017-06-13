package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/6/17.
 */
public class MaxArea {

	public static int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int [] height = {2,5,3,4,9};
		System.out.println(maxArea(height));
	}
}
