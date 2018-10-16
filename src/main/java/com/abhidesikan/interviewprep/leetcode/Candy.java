package com.abhidesikan.interviewprep.leetcode;

public class Candy {
	public static int candy(int[] ratings) {

		int result = 0;

		int [] res = new int[ratings.length];
		for(int i=0; i< ratings.length; i++) {
			res[i] = 1;
		}
		if(ratings.length == 0) {
			return 0;
		}

		//right pass
		int j = 0;
		for(int i=1; i<ratings.length; i++) {
			if(ratings[i] > ratings[j]) {
				res[i] += res[j];
			}
			j++;
		}

		//left pass
		j = ratings.length-1;
		for(int i = ratings.length-2; i >= 0; i--) {
			if(ratings[i] > ratings[j] && res[i] <= res[j]) {
				res[i] = res[j] + 1;
			}
			j--;
		}

		for(int i=0; i<res.length; i++) {
			result += res[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(candy(new int[] {1,6,10,8,7,3,2}));
	}
}
