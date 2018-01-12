package com.abhidesikan.interviewprep.Ola;

public class MinimalOperationsSubstitutions {

	static int[] minimalOperations(String[] words) {
		int[] arr = new int[words.length];
		int index = 0;
		for(String word : words) {
			int totalCount = 0;
			for(int i=0; i<word.length()-1; i++) {
				int count = 1;
				Character c = word.charAt(i);
				if(c == word.charAt(i+1)) {
					count++;
					i++;
					while((i+1 < word.length() - 1) && word.charAt(i+1) == c) {
						count++;
						i++;
					}
				}
				totalCount+= count/2;
			}
			arr[index++] = totalCount;
		}
		return arr;
	}
}
