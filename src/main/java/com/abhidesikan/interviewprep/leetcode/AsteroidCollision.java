package com.abhidesikan.interviewprep.leetcode;

import java.util.Stack;

public class AsteroidCollision {

	public int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> stack = new Stack<>();

		if(asteroids.length == 0) {
			return new int[]{};
		}

		for(int i=0; i<asteroids.length; i++) {
			if(stack.isEmpty()) {
				stack.push(asteroids[i]);
			} else {
				if(stack.peek() > 0 && asteroids[i] > 0) {
					stack.push(asteroids[i]);
				}
				else if (stack.peek() > 0 && asteroids[i] < 0) {
					int temp = Math.abs(asteroids[i]);
					if(stack.peek() < temp) {
						stack.pop();
						i--;
					}
					else if(stack.peek() == temp) {
						stack.pop();
					}
				}
				else {
					stack.push(asteroids[i]);
				}
			}
		}

		int arr[] = new int[stack.size()];
		int i=stack.size()-1;
		while(!stack.isEmpty()) {
			arr[i] = stack.pop();
			i--;
		}
		return arr;
	}
}
