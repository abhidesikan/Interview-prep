package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for(int i=0; i<strs.length; i++) {
			char c[] = strs[i].toCharArray();
			System.out.println(c);
			Arrays.sort(c);
			System.out.println("Sorted "  + new String(c));
			String val = String.valueOf(c);
			System.out.println("val " + val);
			if(!map.containsKey(val)) {
				map.put(val, new ArrayList<String>());
			}
			map.get(val).add(strs[i]);
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		String strs[] = {"ate", "tea", "tan", "nat"};
		System.out.println(new GroupAnagrams().groupAnagrams(strs));
	}
}
