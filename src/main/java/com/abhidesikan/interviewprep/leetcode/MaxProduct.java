package com.abhidesikan.interviewprep.leetcode;

public class MaxProduct {

	public static int maxProduct(String[] words) {

		int check [] = new int [words.length];
		for(int i=0; i<check.length; i++) {
			int num = 0;

			for(int j=0; j<words[i].length(); j++) {
				num |= 1 << (words[i].charAt(j) - 'a');
			}
			check[i] = num;
		}

		int max = 0;

		for(int i=0; i<words.length; i++) {
			for(int j=1; j<words.length; j++) {
				if((check[i] & check[j]) == 0) {
					max = Math.max(max, words[i].length() * words[j].length());
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxProduct(new String[]{"abcd", "efg", "aefg"}));
	}
}
