package com.abhidesikan.interviewprep.leetcode;

import java.util.HashSet;

/**
 * Created by abhidesikan on 5/22/17.
 */
public class MaxNonRepeatingLength {

	public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		int i = 0,j = 0;
		HashSet set = new HashSet();
		while(i < s.length()) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i++));
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(j++));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}
