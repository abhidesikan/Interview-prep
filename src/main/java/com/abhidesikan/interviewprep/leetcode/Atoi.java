package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/6/17.
 */
public class Atoi {
	public static int myAtoi(String str) {

		char[] arr = str.toCharArray();

		boolean flag = false;
		int first = 0;

		for (int i = 0; i < arr.length; i++) {
			while (arr[i] == ' ') {
				i++;
				continue;
			}
			first = i;
			break;
		}

		String result = "";
		if (first == arr.length) {
			return 0;
		} else {
			if (arr[first] == '-') {
				flag = true;
				first++;
			} else if (arr[first] == '+') {
				first++;
			}
			int j = first;

			while (j < arr.length && Character.isDigit(arr[j]) && j == first) {
				result = result + arr[j];
				first++;
				j++;
			}
		}

		if (result.equals("")) {
			return 0;
		}

		long value = 0;
		try {
			value = Long.parseLong(result);
		} catch (NumberFormatException e) {
			if (flag) {
				value = Integer.MIN_VALUE;
				flag = false;
			} else {
				value = Integer.MAX_VALUE;
			}
		}

		if (flag) {
			value = value * -1;
		}
		int finalValue = 0;

		if (value > Integer.MAX_VALUE) {
			finalValue = Integer.MAX_VALUE;
		} else if (value < Integer.MIN_VALUE) {
			finalValue = Integer.MIN_VALUE;
		} else {
			finalValue = (int) value;
		}

		return finalValue;
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("-9223372036854775809"));
	}
}
