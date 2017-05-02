package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/26/17.
 */
public class MaxRepetitiveCharacter {

    public static int getMaxCharacterCount(String word) {

        char arr[] = word.toCharArray();
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<arr.length-2; i++) {
            if(arr[i+1] == arr[i]) {
                count++;
            } else {
                count++;
                if(count>maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String args[]) {
        System.out.println(getMaxCharacterCount("aabbbbbbb"));

    }
}
