package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/6/17.
 */
public class Palindrome {

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}
		if (ReverseInteger.reverse(x) == x) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(2147483647));
	}
}
