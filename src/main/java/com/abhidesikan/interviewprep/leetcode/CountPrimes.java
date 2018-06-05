package com.abhidesikan.interviewprep.leetcode;

public class CountPrimes {

	public static int countPrimes(int n) {
		int count = 0;

		boolean notPrime[] = new boolean[n];

		for (int i = 2; i < n; i++) {
			if (notPrime[i] == false) {
				count++;
			}
			for (int j = 2; i * j < n; j++) {
				notPrime[i * j] = true;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(countPrimes(6));
	}
}
