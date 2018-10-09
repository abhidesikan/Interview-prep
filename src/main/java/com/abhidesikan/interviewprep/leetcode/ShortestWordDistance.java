package com.abhidesikan.interviewprep.leetcode;

public class ShortestWordDistance {

	public static int shortestDistance(String[] words, String word1, String word2) {
		int index1 = -1;
		int index2 = -1;
		int result = Integer.MAX_VALUE;

		for(int i=0; i<words.length; i++) {
			if(words[i].equals(word1)) {
				index1 = i;
			}
			if(words[i].equals(word2)) {
				index2 = i;
			}
			if(index1 >=0 && index2 >=0) {
				result = Math.min(Math.abs(index1-index2), result);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(shortestDistance(new String[] {"nidhi", "abhishek", "dumbos"}, "nidhi", "dumbos"));
	}
}
