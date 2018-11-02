package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class MinStack {

	Stack<Integer> stack;
	int min = Integer.MAX_VALUE;

	public MinStack() {
		stack = new Stack();
	}

	public void push(int x) {
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}

	public void pop() {
		if (stack.pop() == min) {
			min = stack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}
