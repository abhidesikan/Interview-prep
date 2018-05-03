package com.abhidesikan.interviewprep.leetcode;

import java.util.LinkedList;

public class PhoneNumberLetterCombinations {

	public static LinkedList<String> letterCombinations(String digits) {

		String arr[] = new String[] {"+", "/", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

		LinkedList <String> list = new LinkedList<>();
		list.add("");

		for(int i=0; i<digits.length(); i++) {
			int curDigit = Character.getNumericValue(digits.charAt(i));
			while(list.peek().length() == i) {
				String temp = list.remove();
				for(Character c : arr[curDigit].toCharArray()) {
					list.add(temp + c);
				}
			}
		}

		list = removeDummy(list);

		return list;

	}


	public static LinkedList<String> removeDummy(LinkedList<String> list) {

		LinkedList<String>tempList = new LinkedList<String>();
		for(String s : list) {
			String temp = s.replaceAll("/", "");
			tempList.add(temp);
		}

		return tempList;
	}

	public static void main(String[] args) {
		System.out.println(letterCombinations("23456789"));
	}
}
