package com.abhidesikan.interviewprep.careercup;

import java.util.HashMap;

/**
 * Created by abhidesikan on 4/30/17.
 */
public class TrieNode {

	public char c;
	public boolean isLeaf;
	public HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();;

	public TrieNode() {

	}

	public TrieNode(char c) {
		this.c = c;
	}

}
