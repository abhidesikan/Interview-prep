package com.abhidesikan.interviewprep.leetcode;

public class ValidPalindromeII {

	public static boolean validPalindrome(String s) {
		boolean flag = false;

		flag = checkPalindrome(s);

		for(int i=0;i<s.length(); i++) {
			if(checkPalindrome(s.substring(0,i) + s.substring(i+1))) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean checkPalindrome(String s) {
		if(s.isEmpty()) {
			return false;
		}

		int i1 = 0;
		int i2 = s.length()-1;

		char chead, ctail;
		while(i1 <= i2) {
			chead = s.charAt(i1);
			ctail = s.charAt(i2);
			if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)) {
				return false;
			} else {
				i1++;
				i2--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(validPalindrome("abc"));
	}
}
