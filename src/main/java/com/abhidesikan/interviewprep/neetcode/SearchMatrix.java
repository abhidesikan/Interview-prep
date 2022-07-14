package com.abhidesikan.interviewprep.neetcode;

import java.util.Arrays;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length - 1;

        int top = 0;
        int bottom = rows - 1;

        if (target > matrix[bottom][cols]) {
            return false;
        }

        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else if (target > matrix[mid][0]) {
                top = mid + 1;
            }
        }
        System.out.println("bottom " + bottom);
        System.out.println("top " + top);

        if (top <= bottom) {
            return false;
        }

        if (target == matrix[bottom][0]) {
            return true;
        }

        int[] arr = matrix[bottom];
        System.out.println("arr" + Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] arr2 = {{1}};
        boolean result = new SearchMatrix().searchMatrix(arr2, 0);
        System.out.println(result);
    }
}
