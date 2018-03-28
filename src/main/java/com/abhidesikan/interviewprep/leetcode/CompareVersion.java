package com.abhidesikan.interviewprep.leetcode;

public class CompareVersion {
	public static int compareVersion(String version1, String version2) {

		String arr1[] = version1.split("\\.");
		String arr2[] = version2.split("\\.");

		int length = arr1.length < arr2.length ? arr2.length : arr1.length;
		for(int i=0; i<length; i++) {
			Integer v1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
			Integer v2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
			int compare = v1.compareTo(v2);
			if(compare != 0) {
				return compare;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(compareVersion("1.2.3", "1.2"));
	}
}
