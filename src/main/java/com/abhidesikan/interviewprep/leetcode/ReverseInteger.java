package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/4/17.
 */
public class ReverseInteger {

	public static int reverse(int x) {

		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;
			System.out.println(result + " result");
			System.out.println(newResult + " new result");
			if ((newResult - tail) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		int x = 1534236469;
		System.out.println(reverse(x));
	}
}
