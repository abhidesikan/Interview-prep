package com.abhidesikan.interviewprep.leetcode;

public class CountPalindromicSubstring {

	static int count = 0;
	public static int countSubstrings(String s) {
		if(s.length() == 0) {
			return 0;
		}
		for(int i=0; i<s.length(); i++) {
			extendPalindrome(s, i, i);
			extendPalindrome(s, i, i+1);
		}

		return count;
	}

	public static void extendPalindrome(String s, int left, int right) {
		while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++; left--; right++;
		}
	}

	public static void main(String[] args) {
		System.out.println(countSubstrings("aaa"));
	}
}
