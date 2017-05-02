package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 5/1/17.
 */
public class ReverseString {

	public static String reverseString(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0 ; i--) {
			rev = rev+s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("Abhishek"));
	}
}
