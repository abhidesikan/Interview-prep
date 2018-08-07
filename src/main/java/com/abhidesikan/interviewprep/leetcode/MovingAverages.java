package com.abhidesikan.interviewprep.leetcode;

public class MovingAverages {

	public static void movingAverages(double [] arr, int window) {
		int temp = window;
		double sum = 0;
		for(int i=0; i<window; i++) {
			sum += arr[i];
		}
		System.out.println((double)sum/window);

		int step = 0;
		for(int i=1; i<arr.length-window; i++) {
			sum = sum - arr[step] + arr[i+window-1];
			System.out.println((double)sum/window);
			step++;
		}
	}

	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		double arr[] = new double[] {1,2,3,4,5,6,7,8,9};
		double arr2[] = new double[]{1.5,2.5,3.5,4.5};
		double arr3[] = new double[]{10,8,5,3,7,1,9,6};
		movingAverages(arr, 2);
		System.out.println("---------------");
		movingAverages(arr, 3);
		System.out.println("---------------");
		movingAverages(arr2, 2);
		System.out.println("---------------");
		movingAverages(arr3, 2);
	}
}
