package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class RotateClockwiseAntiClockwise {


	public static void rotateClockWise(int arr[][]) {

		//Top to down swap rows
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int[] temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		//swap diagonals
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		System.out.println(Arrays.deepToString(arr));
	}


	public static void rotateAntiClockwise(int arr[][]) {

		int start = 0;
		int end = arr.length;

		while(start < end) {
			swapElements(arr[start]);
			start++;
		}

		//swap diagonals
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}


	public static void swapElements(int arr[]) {
		int start = 0; int end = arr.length-1;

		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		rotateClockWise(new int [][] {{1,2,3}, {4,5,6}, {7,8,9}});
		rotateAntiClockwise(new int [][] {{1,2,3}, {4,5,6}, {7,8,9}});
	}

}
