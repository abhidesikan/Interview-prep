package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

/**
 * Created by abhidesikan on 6/27/17.
 */
public class GenerateParanthesis {

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		backtrack(list, "", 0, 0, n);
		return list;
	}

	public static void backtrack(List<String> list, String str, int open, int close, int max) {
		System.out.println("open  "+ open + "close " + close);

		if (str.length() == max * 2) {
			System.out.println(str);
			list.add(str);
			return;
		}

		if (open < max) {
			backtrack(list, str + "(", open + 1, close, max);
		}
		if (close < open) {
			backtrack(list, str + ")", open, close + 1, max);
		}
	}

	public static void main(String[] args) {
		System.out.println(generateParenthesis(2));
	}
}
