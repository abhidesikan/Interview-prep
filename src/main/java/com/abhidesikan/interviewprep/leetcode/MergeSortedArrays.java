package com.abhidesikan.interviewprep.leetcode;

public class MergeSortedArrays {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int indexA = m - 1;
		int indexB = n - 1;
		int indexMerged = m + n - 1;

		while(indexB >= 0) {
			if(indexA >=0  && nums1[indexA] > nums2[indexB]) {
				nums1[indexMerged] = nums1[indexA];
				indexA--;
			} else {
				nums1[indexMerged] = nums2[indexB];
				indexB--;
			}
			indexMerged--;
		}
	}
}
