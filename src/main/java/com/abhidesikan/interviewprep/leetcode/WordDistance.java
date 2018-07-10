package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordDistance {
	static HashMap<String, List<Integer>> map;

	public WordDistance(String[] words) {
		map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				map.get(words[i]).add(i);
			} else {
				List<Integer> list = new ArrayList();
				list.add(i);
				map.put(words[i], list);
			}
		}
	}

	public static int shortest(String word1, String word2) {
		int diff = Integer.MAX_VALUE;
		List<Integer> list1 = map.get(word1);
		List<Integer> list2 = map.get(word2);

		for (int i = 0, j = 0; i < list1.size() && j < list2.size(); ) {
			if (list1.get(i) < list2.get(j)) {
				diff = Math.min(list2.get(j) - list1.get(i), diff);
				i++;
			} else {
				diff = Math.min(list1.get(i) - list2.get(j), diff);
				j++;
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		WordDistance distance = new WordDistance(new String[]{"abhi", "magen", "meet", "soon"});
		System.out.println(shortest("abhi", "magen"));
	}
}
