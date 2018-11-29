package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet();
		HashSet<Integer> set2 = new HashSet();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				set2.add(nums2[i]);
			}

		}
		int[] result = new int[set2.size()];
		int k = 0;
		for (Integer i : set2) {
			result[k] = i;
			k++;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2})));
	}
}
