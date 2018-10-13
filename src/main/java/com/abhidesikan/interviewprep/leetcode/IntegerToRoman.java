package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/13/17.
 */
public class IntegerToRoman {

	public static String intToRoman(int num) {
		String M[] = {"", "M", "MM", "MMM"};
		String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

		System.out.println(Math.abs(Integer.MAX_VALUE * 2));
		return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
	}

	public static void main(String[] args) {
		System.out.println(intToRoman(3250));
	}

}
