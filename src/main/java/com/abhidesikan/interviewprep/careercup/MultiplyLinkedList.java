package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/27/17.
 */
public class MultiplyLinkedList {

    public static int multiplyLists(LinkedList a, LinkedList b) {

        String numA = "";
        String numB = "" ;

        while (a != null) {
            numA += String.valueOf(a.data);
            a = a.next;
        }
        while (b != null) {
            numB += String.valueOf(b.data);
            b = b.next;
        }

        int num1 = Integer.parseInt(numA);
        int num2 = Integer.parseInt(numB);

        return num1 * num2;
    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList(1);
        a.next = new LinkedList(2);

        LinkedList b = new LinkedList(3);

        System.out.println(multiplyLists(a, b));
    }
}
