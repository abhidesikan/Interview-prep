package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String temp = "/* testing */";
		String [] split = temp.split("/\\*");
		System.out.println(Arrays.toString(split));

	}
}
