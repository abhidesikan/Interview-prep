package com.abhidesikan.interviewprep.careercup;

import java.util.HashMap;

/**
 * Created by abhidesikan on 4/30/17.
 */
public class Trie {

	private static TrieNode root = new TrieNode();


	public static void insertWord(String word) {

		HashMap<Character, TrieNode> children = root.children;
		TrieNode t;

		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(children.containsKey(c)) {
				t = children.get(c);
			} else {
				t = new TrieNode(c);
				children.put(c, t);
			}
			children = t.children;
			if(word.length()-1 == i) {
				t.isLeaf = true;
			}
		}
	}

	public static boolean searchWord(String word) {

		HashMap<Character, TrieNode> children = root.children;
		TrieNode t;

		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(children.containsKey(c)) {
				t = children.get(c);
				children = t.children;
			} else {
				return false;
			}
			if(word.length()-1 == i && t.isLeaf) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		insertWord("word");
		insertWord("wordsmith");
		System.out.println(searchWord("word"));
		System.out.println(searchWord("smith"));
	}
}
