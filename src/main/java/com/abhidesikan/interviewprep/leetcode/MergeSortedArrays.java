package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

	public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
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
		return nums1;
	}

	public static void main(String[] args) {

		int A[] = new int[7];
		A[0] = 1;
		A[1] = 2;
		A[2] = 6;
		A[3] = 7;
		int B [] = new int[]{3,4,5};

		System.out.println(Arrays.toString(merge(A, 4, B, 3)));
	}
}
