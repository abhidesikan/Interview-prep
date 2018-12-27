package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList();

		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}

		List<Integer> result = new ArrayList();

		for (int i = 0; i < nums2.length; i++) {
			if (list.contains(nums2[i])) {
				result.add(nums2[i]);
				list.remove(Integer.valueOf(nums2[i]));
			}
		}

		int[] array = result.stream().mapToInt(i -> i).toArray();

		return array;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersect(new int[]{3,4,1,2}, new int[] {1,2,1,2})));
	}
}
