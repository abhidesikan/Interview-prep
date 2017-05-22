package com.abhidesikan.interviewprep.careercup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by abhidesikan on 4/28/17.
 */
public class NextHighestNumber {

    public static void printNextHighestNumber(String num) {

        char arr[] = num.toCharArray();

        int i;

        for(i=arr.length-1; i>0; i--) {
            if(arr[i-1] < arr[i]) {
                break;
            }
        }

        if(i == 0) {
            System.out.println("Cant find next highest");
            return;
        }

        char pos = arr[i-1];
        char small = arr[i];
        int finalPos = 0;

        for(int j=i; j <arr.length; j++) {
            if(arr[j] > pos && small > arr[j]) {
                small = arr[j];
                finalPos = j;
            }
        }
        //swap current with next lowest element
        arr = swapValues(arr, i-1, finalPos);
        //sort remaining elements
        char temp [] = new char[arr.length];

        for(int k=i; k<arr.length; k++) {
            temp[k] = arr[k];
        }
		Arrays.sort(temp);

        for(int p=0; p<arr.length; p++) {
        	if(temp[p] == '\u0000'){
				temp[p] = arr[p];
			}
		}
        System.out.println(new String(temp));

    }

    public static char[] swapValues(char arr[], int i, int  j) {

        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

        return arr;
    }

    public static void main(String[] args) {
        String num = "1354";
        printNextHighestNumber(num);
    }
}


