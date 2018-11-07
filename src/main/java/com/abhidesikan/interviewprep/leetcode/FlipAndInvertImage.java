package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class FlipAndInvertImage {

	public static int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			reverseRow(A[i]);
			invertRow(A[i]);
		}
		return A;
	}

	public static void reverseRow(int[] row) {
		int start = 0;
		int end = row.length - 1;
		while (start < end) {
			int temp = row[start];
			row[start] = row[end];
			row[end] = temp;
			start++;
			end--;
		}
	}

	public static void invertRow(int[] row) {
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 0) {
				row[i] = 1;
			} else {
				row[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(flipAndInvertImage(new int[][]{{1,0,0}, {1,1,1}, {1,0,1}})));
	}
}
