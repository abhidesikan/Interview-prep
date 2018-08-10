package com.abhidesikan.interviewprep.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {

	public static String frequencySort(String s) {
		TreeMap<Character, Integer> map = new TreeMap();

		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		StringBuilder sb = new StringBuilder();

		map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()) .forEach((entry) -> {
			for(int i = 0; i < entry.getValue(); i++)
				sb.append(entry.getKey());
		});

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(frequencySort("Tree"));
	}
}
