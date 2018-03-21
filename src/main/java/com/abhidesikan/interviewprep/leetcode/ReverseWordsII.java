package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class ReverseWordsII {

	public static void reverseWords(char[] str) {

	//	swapChar(str, 0, str.length - 1);
		int start = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				swapChar(str, start, i - 1);
				start = i + 1;
			}
		}
		swapChar(str, start, str.length - 1);
	}

	public static void swapChar(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		char[] arr = new char[] {'a', 'b', 'h', 'i', ' ', 's', 'h', 'e', 'k'};
		reverseWords(arr);
		System.out.println(Arrays.toString(arr));
	}

}
