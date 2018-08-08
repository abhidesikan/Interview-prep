package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class RemoveInvalidParanthesis {

	public static List<String> removeInvalidParentheses(String s) {

		List<String> res = new ArrayList();

		if(s == null) {
			return res;
		}
		Queue<String> queue = new LinkedList();
		Set<String> set = new HashSet();

		queue.add(s);
		set.add(s);

		boolean found = false;
		while(!queue.isEmpty()) {

			String cur = queue.poll();

			if(isValid(cur)) {
				res.add(cur);
				found = true;
			}

			if(found) {
				continue;
			}

			for(int i=0; i<cur.length(); i++) {
				if (cur.charAt(i) != '(' && cur.charAt(i) != ')') {
					continue;
				}

				String temp = cur.substring(0,i) + cur.substring(i+1);
				if(!set.contains(temp)) {
					queue.add(temp);
					set.add(temp);
				}

			}
		}

		return res;
	}

	public static boolean isValid(String s) {
		int left = 0;
		int right = 0;

		for(int i=0; i<s.length(); i++) {
			if(left < right) {
				return false;
			}
			if(s.charAt(i) == '(') {
				left++;
			}
			if(s.charAt(i) == ')') {
				right++;
			} else {
				continue;
			}
		}

		return left == right;
	}

	public static void main(String[] args) {
		System.out.println(removeInvalidParentheses("((())))"));
	}
}
