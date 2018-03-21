package com.abhidesikan.interviewprep.Apple;

import com.abhidesikan.interviewprep.careercup.Trie;

import java.util.ArrayList;
import java.util.List;


public class CompoundWords {

	public static String getCompoundWord(List<String> wordList) {

		for (String word : wordList) {
			Trie.insertWord(word);
		}
		int max = Integer.MIN_VALUE;

		for (String word : wordList) {

		}
		System.out.println(findLengthOfCompoundWord("cats", 1));
		return null;
	}


	public static boolean findLengthOfCompoundWord(String word, int position) {
		System.out.println(word + " "  + position);

		if(position >= word.length()) {
			return true;
		}
		while(position < word.length()) {
			System.out.println(word.substring(0, position) + " substring");
			if(Trie.searchWord(word.substring(0, position))) {
				return findLengthOfCompoundWord(word.substring(position), position++);
			} else {
				position++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>();
		wordList.add("cat");
		wordList.add("cats");
		wordList.add("catsanddogs");
		wordList.add("and");
		wordList.add("dog");
		wordList.add("dogs");

		System.out.println(getCompoundWord(wordList));
	}
}
