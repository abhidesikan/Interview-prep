package com.abhidesikan.interviewprep.leetcode;

public class ValidPalindromeII {

	public static boolean validPalindrome(String s) {

		if (s.length() == 0) {
			return true;
		}

		int start = 0;
		int end = s.length() - 1;
		int count = 0;

		while (start < end && s.charAt(start) == s.charAt(end)) {
			start++;
			end--;
		}

		if (start > end) {
			return true;
		}

		if (checkPalindrome(s, start + 1, end) || checkPalindrome(s, start, end - 1)) {
			return true;
		}

		return false;
	}

	public static boolean checkPalindrome(String s, int i, int j) {

		while (i <= j && s.charAt(i) == s.charAt(j)) {
			i++;
			j--;
		}

		if (i > j) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(validPalindrome("abc"));
	}
}
