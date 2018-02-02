package com.abhidesikan.interviewprep.leetcode;

public class IsAnagram {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int arr[] = new int[256];

		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)]++;
		}

		for(int i=0; i<t.length(); i++) {
			if(--arr[t.charAt(i)] < 0)  {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}
}
