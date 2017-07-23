package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {

		if(s == null || s.trim().length() < 1) {
			return 0;
		}

		String arr[] = s.split(" ");
		return arr[arr.length-1].length();
	}

	public static void main(String[] args) {
		String s = "Hi my name is Abhishek  ";
		System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
	}
}
