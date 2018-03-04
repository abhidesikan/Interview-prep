package com.abhidesikan.interviewprep.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {

		char arr1[] = pattern.toCharArray();
		String arr2[] = str.split(" ");
		if(arr1.length != arr2.length) {
			return false;
		}

		Map<Character, String> map = new HashMap<>();

		for(int i=0; i<arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				if(!map.get(arr1[i]).equals(arr2[i])) {
					return false;
				}
			} else {
				if(map.containsValue(arr2[i])) {
					return false;
				}
				map.put(arr1[i], arr2[i]);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
}
