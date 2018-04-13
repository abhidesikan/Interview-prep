package com.abhidesikan.interviewprep.leetcode;

import java.util.LinkedList;

public class LongestValidParantheses {
	public static int longestValidParentheses(String s) {
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(-1);
		int result = 0;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
				stack.pop();
				result = Math.max(result, i - stack.peek());
			} else {
				stack.push(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("))((()()()))"));
	}
}
