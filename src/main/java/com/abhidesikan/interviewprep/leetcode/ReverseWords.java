package com.abhidesikan.interviewprep.leetcode;

public class ReverseWords {
	public static String reverseWords(String s) {

		if(s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder();

		String words[] = s.split(" ");

		for(int i=0; i<words.length; i++) {
			String word = words[i];
			for(int j=word.length()-1; j >= 0; j--) {
				sb.append(word.charAt(j));
			}
			sb.append(' ');
		}

		String result = sb.toString();
		return result.substring(0, result.length()-1);
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Abhishek is awesome"));
	}
}
