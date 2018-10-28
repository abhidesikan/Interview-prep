package com.abhidesikan.interviewprep.leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord)) return 0;
		Queue<String> queue = new LinkedList<String>();
		queue.add(beginWord);
		int level = 0;
		while (!queue.isEmpty()) {
			level++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				String cur = queue.poll();
				if (cur.equals(endWord)) return level;
				for (Iterator<String> it = wordList.iterator(); it.hasNext(); ) {
					String str = it.next();
					if (this.check(str, cur)) {
						it.remove();
						queue.add(str);
					}
				}
			}
		}
		return 0;
	}

	public boolean check(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) count++;
		}
		return count == 1;
	}
}
