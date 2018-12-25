package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		int arr[] = new int[digits.length];
		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1) {
				carry = (digits[i] + 1) / 10;
				arr[i] = (digits[i] + 1) % 10;
			} else {
				arr[i] = (digits[i] + carry) % 10;
				carry = (digits[i] + carry) / 10;
			}
		}

		int[] res = new int[digits.length + 1];
		if (carry == 1) {
			for (int i = 0; i < digits.length; i++) {
				res[i + 1] = arr[i];
			}
			res[0] = 1;
			return res;
		}

		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {4,2,3,1,9})));
	}
}
