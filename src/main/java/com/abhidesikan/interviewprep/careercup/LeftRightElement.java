package com.abhidesikan.interviewprep.careercup;

import java.util.Arrays;

/**
 * Created by abhidesikan on 5/1/17.
 */
public class LeftRightElement {

	public static void findElement(int a[]) {

		int min [] = new int[a.length];
		int minSeen = a[a.length-1];

		for(int i=a.length-1; i>=0; i--) {
			if(a[i] < minSeen) {
				min[i] = a[i];
				minSeen = a[i];
			} else {
				min[i] = minSeen;
			}
		}

		int max[] = new int[a.length];
		int maxSeen = a[0];

		for(int i=0; i<a.length; i++) {
			if(a[i] > maxSeen) {
				max[i] = a[i];
				maxSeen = a[i];
			} else {
				max[i] = maxSeen;
			}
		}

		for(int i=0; i<a.length; i++) {
			if(a[i] >= max[i] && a[i] <= min[i]) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {5,4,3,7,4,1,2,8,10};
		findElement(a);
	}
}
