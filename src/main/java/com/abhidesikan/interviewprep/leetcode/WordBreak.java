package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordBreak {

	public static boolean wordBreak(String s, List<String> wordDict) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		int[] visited = new int[s.length()];
		while (!queue.isEmpty()) {
			int start = queue.remove();
			if (visited[start] == 0) {
				for (int end = start + 1; end <= s.length(); end++) {
					if (wordDict.contains(s.substring(start, end))) {
						queue.add(end);
						if (end == s.length()) {
							return true;
						}
					}
				}
				visited[start] = 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("cats");
		list.add("dogs");
		list.add("and");
		System.out.println(wordBreak("catsanddogs", list));
	}
}
