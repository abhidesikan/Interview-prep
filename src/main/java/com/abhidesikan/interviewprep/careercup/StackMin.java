package com.abhidesikan.interviewprep.careercup;

import java.util.Stack;

/**
 * Created by abhidesikan on 4/25/17.
 */
public class StackMin {

    private static Stack stack = new Stack();
    private static Stack minStack = new Stack();

    public static void push(int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            minStack.push(data);
        } else {
            stack.push(data);
            minStack.push(Math.min((Integer) minStack.peek(), data));
        }
    }

    public static int pop() {
        minStack.pop();
        return (Integer) stack.pop();
    }

    public static int getMinValue() {
        return (Integer) minStack.peek();
    }

    public static void main(String args[]) {
        push(2);
        System.out.println(getMinValue());
        push(4);
        System.out.println(getMinValue());
        pop();
        System.out.println(getMinValue());
        push(5);
        push(7);
        push(1);
        System.out.println(getMinValue());
        pop();
        System.out.println(getMinValue());
    }
}
