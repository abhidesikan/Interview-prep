package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DistinctSubstrings {

	public static List<String> distinctSubstring(String s, int k) {
		List<String> subs = new ArrayList<>();
		int start = 0, end = 0, ctr = 0;
		int [] map = new int[128];
		while(end < s.length()) {
			if(map[s.charAt(end) - 'a'] > 0) {
				ctr++;
			}
			map[s.charAt(end) -'a']++;
			end++;
			while(ctr > 0) {
				if(map[s.charAt(start) -'a'] > 1) {
					ctr--;
				}
				map[s.charAt(start) -'a']--;
				start++;
			}
			if(end - start == k) {
				System.out.println(start + " " + end);
				if(ctr == 0) {
					subs.add(s.substring(start, end));
					map[s.charAt(start) - 'a']--;
					start++;
				}
			}
		}
		return subs;
	}

	public static void main(String[] args) {
		System.out.println(distinctSubstring("abhiiiishek", 3));
	}
}
