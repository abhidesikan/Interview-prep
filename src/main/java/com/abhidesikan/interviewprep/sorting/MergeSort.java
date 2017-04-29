package com.abhidesikan.interviewprep.sorting;

import java.util.Arrays;

/**
 * Created by abhidesikan on 2/28/17.
 */
public class MergeSort {

    private int[] numbers;
    private int[] helper;

    private int number;

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        System.out.println("low value " + low + " high value " + high);
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        System.out.println("low " + low + " middle " + middle + " high "+ high + "\n");
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }
        System.out.println("Helper " + Arrays.toString(helper) + "\n");

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

        System.out.println("Final number " + Arrays.toString(numbers) + "\n");

    }

    public static void main(String args[]) {
        int array[] = {8, 6, 3, 5, 1, 11};
        System.out.println("Initial array "+ Arrays.toString(array) + "\n");
        new MergeSort().sort(array);

    }
}