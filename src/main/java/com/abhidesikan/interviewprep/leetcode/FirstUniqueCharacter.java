package com.abhidesikan.interviewprep.leetcode;

public class FirstUniqueCharacter {

	public static int firstUniqChar(String s) {
		if(s == null) {
			return -1;
		}

		int count[] = new int[26];

		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}

		for(int i=0; i<s.length(); i++) {
			if(count[s.charAt(i) -'a'] == 1) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcodelove"));
	}
}
