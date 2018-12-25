package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

	public static int[] dailyTemperatures(int[] T) {

		Stack<Integer> stack = new Stack<Integer>();

		int [] res = new int[T.length];
		int index = 0;

		for(int i=T.length-1; i>=0; i--) {
			while(!stack.isEmpty() && T[stack.peek()] <= T[i]) {
				stack.pop();
			}

			if(!stack.isEmpty()) {
				res[i] = stack.peek() - i;
			}

			stack.push(i);
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(dailyTemperatures(new int[] {3,2,1,5,4,7})));
	}
}
