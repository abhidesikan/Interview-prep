package com.abhidesikan.interviewprep.leetcode;

public class ShortestWordDistanceIII {

	public static int shortestWordDistance(String[] words, String word1, String word2) {

		int index = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1) || words[i].equals(word2)) {
				if (index != -1 && (word1.equals(word2) || !words[i].equals(words[index]))) {
					min = Math.min(min, i - index);
				}
				index = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(shortestWordDistance(
				new String[]{"nidhi", "abhi", "dumbos", "nidhi"}, "nidhi", "dumbos"));
	}
}
