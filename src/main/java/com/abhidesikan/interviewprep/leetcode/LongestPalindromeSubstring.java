package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 5/22/17.
 */
public class LongestPalindromeSubstring {

	public static String longestPalindromeSubstring(String s) {

		char arr[] = s.toCharArray();
		int len = s.length();
		while (len >= 0) {
			for (int i = 0; i + len - 1 < arr.length; i++) {
				int left = i;
				int right = i + len - 1;
				boolean valid = true;
				while (left < right) {
					if (arr[left] != arr[right]) {
						valid = false;
						break;
					}
					left++;
					right--;
				}
				if (valid) {
					return s.substring(i, i + len);
				}
			}
			len--;
		}

		return "";
	}

	public static void main(String[] args) {
		System.out.println(longestPalindromeSubstring("babad"));
		System.out.println(longestPalindromeSubstring("cbbd"));
		System.out.println(longestPalindromeSubstring("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
	}
}
