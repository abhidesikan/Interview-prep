package com.abhidesikan.interviewprep.leetcode;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {

		if (s.isEmpty()) {
			return true;
		}
		int i1 = 0;
		int i2 = s.length() -1;
		char chead, ctail;
		while(i1 <= i2) {
			chead = s.charAt(i1);
			ctail = s.charAt(i2);
			if(!Character.isLetterOrDigit(chead)) {
				i1++;
			}
			else if(!Character.isLetterOrDigit(ctail)) {
				i2--;
			} else {
				if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)) {
					return false;
				} else {
					i1++;
					i2--;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
