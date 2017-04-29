package com.abhidesikan.interviewprep.hacckerrank;

/**
 * Created by abhidesikan on 4/1/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class NumberNeeded {
    public static int numberNeeded(String first, String second) {
        int count = 0;
        int [] arr = new int[26];
        char [] firstArr = first.toCharArray();
        char [] secondArr = second.toCharArray();
        for (int i=0; i< firstArr.length; i++) {
            arr[firstArr[i]-'a']++;
        }
        for (int j=0; j< secondArr.length; j++) {
            arr[secondArr[j]-'a']--;
        }
        for (int k = 0; k< arr.length; k++) {
            count += Math.abs(arr[k]);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
