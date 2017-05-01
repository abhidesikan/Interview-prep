package com.abhidesikan.interviewprep.careercup;

import java.util.Arrays;

/**
 * Created by abhidesikan on 5/1/17.
 */
public class MergeSorted {


	public static void mergeSorted(int a[], int b[]) {
		int len1 = a.length;
		int len2 = b.length;
		int len = len1+len2;
		int c[] = new int[len];

		int i = 0,j = 0, k=0;

		while(i<a.length && j <b.length) {
			if(a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		if(i == a.length) {
			while(j<b.length) {
				c[k++] = b[j++];
			}
		}
		if(j == b.length) {
			while(i<a.length) {
				c[k++] = a[i++];
			}
		}

		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		int a [] = {2,4,6};
		int b[] = {1,3,5,7};
		mergeSorted(a,b);
	}
}
