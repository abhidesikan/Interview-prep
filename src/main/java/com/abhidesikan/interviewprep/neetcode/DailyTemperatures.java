package com.abhidesikan.interviewprep.neetcode;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                Integer[] arr = stack.pop();
                result[arr[1]] = i - arr[1];
            }
            stack.push(new Integer[]{temperatures[i], i});
        }
        return result;
    }
}
