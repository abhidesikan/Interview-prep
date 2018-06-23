package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class MinimumSwapsDecreasingOrder {

	public static int minSwap(int[] array) {
		int[] sorted = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sorted[i] = array[i];
		}
		Arrays.sort(sorted);

		int[] reverse = new int[sorted.length];
		int k = 0;
		for (int i = sorted.length - 1; i >= 0; i--) {
			reverse[k] = sorted[i];
			k++;
		}

		int count = 0;
		int i = 0;
		int l = 0;
		int m = 0;
		while (i < array.length) {
			if (array[i] != reverse[l]) {
				System.out.println("l value " + l);
				while (array[m] != reverse[l]) {
					m++;
				}
				System.out.println(i + " " + m);
				swap(array, i, m);
				System.out.println(Arrays.toString(array));
				count++;
				m = 0;
			} else {
				l++;
				i++;
			}
		}

		return count;
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println(minSwap(new int[]{3, 1, 2, 4, 5}));
	}
}
