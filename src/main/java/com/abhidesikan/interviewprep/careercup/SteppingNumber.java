package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class SteppingNumber {

	public static int countSteppingNumbers(int a[]) {

		int count = 0;
		for(int i=0; i<a.length; i++) {
			String num = String.valueOf(a[i]);
			if(isSteppingNumber(num)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isSteppingNumber(String num) {

		char a[] = num.toCharArray();
		for(int i=0; i<a.length-1; i++) {
			if(Math.abs(a[i+1]-a[i]) != 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int a[] = {123, 222, 456789, 12432, 432};
		System.out.println(countSteppingNumbers(a));
	}
}
