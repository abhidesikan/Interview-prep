package com.abhidesikan.interviewprep.careercup;

public class CoinChange {

	public static int makeChange(int amount) {

		if (amount < 0) {
			return 0;
		}

		if (amount == 0) {
			return 1;
		}

		return makeChange(amount - 1) + makeChange(amount - 5) + makeChange(amount - 10)
				+ makeChange(amount - 25);
	}

	public static void main(String[] args) {
		System.out.println(makeChange(10));
	}
}
