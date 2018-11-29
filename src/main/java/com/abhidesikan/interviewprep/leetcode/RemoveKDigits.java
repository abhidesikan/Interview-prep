package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class RemoveKDigits {

	public static String removeKdigits(String num, int k) {

		Stack<Character> stack = new Stack();

		if (num.length() == k) {
			return "0";
		}
		System.out.println(num.charAt(0));
		stack.push(num.charAt(0));

		int temp = 0;

		for (int i = 1; i < num.length(); i++) {
			if (temp < k) {
				if (stack.peek() < num.charAt(i)) {
					stack.push(num.charAt(i));
				} else {
					while (temp < k && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
						stack.pop();
						temp++;
					}
					stack.push(num.charAt(i));
				}
			} else {
				stack.push(num.charAt(i));
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		String result = sb.reverse().toString();
		int index = 0;

		if (temp < k) {
			result = result.substring(0, result.length() - k + temp);
		}

		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) != '0') {
				break;
			} else {
				index++;
			}
		}
		return result.substring(index).isEmpty() ? "0" : result.substring(index);
	}

	public static void main(String[] args) {
		System.out.println(removeKdigits("12223", 2));
	}
}
