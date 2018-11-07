package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class SortArrayByParity {

	public static int[] sortArrayByParity(int[] A) {

		for(int i=0, j=0; i<A.length; i++) {
			if(A[i] % 2 == 0) {
				int temp = A[j];
				A[j++] = A[i];
				A[i] = temp;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByParity(new int[] {2,1,4,5})));
	}
}
