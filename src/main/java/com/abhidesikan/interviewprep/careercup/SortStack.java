package com.abhidesikan.interviewprep.careercup;

import java.util.Stack;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class SortStack {

	public static void sortStack(Stack<Integer> stack) {

		if(stack.isEmpty()) {
			return;
		}
		int pop = stack.pop();
		sortStack(stack);
		insertInOrder(stack, pop);
	}

	public static Stack insertInOrder(Stack<Integer> stack, int element) {
		if(stack.isEmpty() || stack.peek() < element) {
			stack.push(element);
		} else {
			int pop = stack.pop();
			insertInOrder(stack, element);
			stack.push(pop);
		}
		return stack;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		sortStack(stack);
		System.out.println(stack);
	}
}
