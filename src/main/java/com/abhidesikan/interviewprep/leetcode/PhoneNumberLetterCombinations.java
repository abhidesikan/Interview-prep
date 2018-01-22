package com.abhidesikan.interviewprep.leetcode;

import java.util.LinkedList;
import java.util.List;

public class PhoneNumberLetterCombinations {

	public static List<String> letterCombinations(String digits) {
		String arr[] = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

		LinkedList<String> list = new LinkedList<>();

		if (digits.length() <= 0) {
			return list;
		}

		String temp = "";
		list.add(temp);

		for (int i = 0; i < digits.length(); i++) {
			int a = Character.getNumericValue(digits.charAt(i));
			while (list.peek().length() == i) {
				String t = list.remove();
				for (Character c : arr[a].toCharArray()) {
					list.add(t + c);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(letterCombinations("23456789"));
	}
}
