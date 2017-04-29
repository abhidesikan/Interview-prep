package com.abhidesikan.interviewprep.careercup;


/**
 * Created by abhidesikan on 4/25/17.
 */
public class MaximumOnes {


    public static int maxOnes(int arr[][]) {

        int count = 0;
        int maxCount = 0;


        for(int i=0; i<arr.length; i++) {
            for(int j=arr[0].length-1; j>0; j--) {
                if(arr[i][j] !=0) {
                    count++;
                } else {
                    break;
                }
            }
            if(count > maxCount) {

            }

        }
        return 0;
    }
}
