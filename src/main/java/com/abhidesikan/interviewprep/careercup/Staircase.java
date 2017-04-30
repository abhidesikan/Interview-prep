package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/30/17.
 */
public class Staircase {

	public static int countStepsCombination(int n) {

		if(n < 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}

		return countStepsCombination(n-1) + countStepsCombination(n-2) + countStepsCombination(n-3);
	}

	public static void main(String[] args) {
		System.out.println(countStepsCombination(5));
	}
}
