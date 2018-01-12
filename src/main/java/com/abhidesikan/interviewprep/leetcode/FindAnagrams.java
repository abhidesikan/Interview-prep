package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

	public static List<Integer> findAnagrams(String s, String p) {

		int arr[] = new int[] {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

		int unique = 1;

		for(int i=0; i<p.length(); i++) {
			unique *= arr[p.charAt(i) -'a'];
		}

		int length = p.length();
		List<Integer> result = new ArrayList();

		for(int j=0; j<s.length()-p.length()+1; j++) {
			int temp = 1;
			int c = j;
			while(length > 0) {
				temp *= arr[s.charAt(c) -'a'];
				length--;
				c++;
			}
			if(temp == unique) {
				result.add(j);
			}
			length = p.length();
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(findAnagrams("abcadadada", "abc"));
	}
}
