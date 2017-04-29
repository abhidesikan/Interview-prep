package com.abhidesikan.interviewprep.BigO;

/**
 * Created by abhidesikan on 10/28/16.
 */
public class Permutation {

    public void permutation(String str) {
        permutation(str, "");
    }

    public void permutation(String str, String prefix) {
        if(toString().length() == 0) {
            System.out.println( "In here " + prefix + "\n");
        } else {
            for (int i=0; i<str.length(); i++) {
                System.out.printf("i value " + i + "\n");
                String rem = str.substring(0,i) + str.substring(i+1);
                System.out.printf("First substring " + str.substring(0,i) + "\n");
                System.out.println("Second substring " + str.substring(i+1) + "\n");
                System.out.printf("Rem value " + rem + "\n");
                System.out.printf("char " + str.charAt(i) + "\n");
				System.out.printf("Prefix " + prefix + str.charAt(i) + "\n");
				permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String args[]) {
        Permutation permutation = new Permutation();
        permutation.permutation("ABC");
    }
}
