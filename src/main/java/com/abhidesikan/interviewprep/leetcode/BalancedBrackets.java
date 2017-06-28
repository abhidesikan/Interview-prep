package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

/**
 * Created by abhidesikan on 6/18/17.
 */
public class BalancedBrackets {

	public static boolean isValid(String s) {
		char arr[] = s.toCharArray();
		Stack stack = new Stack();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			char brackets = arr[i];
			switch (brackets) {
				case '{':
					stack.push('}');
					break;
				case '(':
					stack.push(')');
					break;
				case '[':
					stack.push(']');
					break;
				default:
					if (stack.empty() || (Character) stack.pop() != brackets) {
						flag = true;
					}
					break;
			}
		}
		if (!stack.empty()) {
			flag = true;
		}
		if (flag) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "(())";
		System.out.println(isValid(s));
	}
}
