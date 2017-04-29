package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/27/17.
 */
public class MaximumSumBoxes {

    public static int findMaxSum(int a[]) {

        int curSum = 0;
        int maxSum = 0;

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                curSum += a[j];
                if(curSum > maxSum) {
                    maxSum = curSum;
                    j++;
                } else {
                    curSum = 0;
                }
            }
            curSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {-2, -3, 6, 4, 5, -3};
        System.out.println(findMaxSum(a));
    }
}
