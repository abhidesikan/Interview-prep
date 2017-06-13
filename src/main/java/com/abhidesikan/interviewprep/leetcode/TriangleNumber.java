package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 6/10/17.
 */
public class TriangleNumber {
	public static int triangleNumber(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
					if((nums[i] + nums[j]) > nums[k] && (nums[j] + nums[k]) > nums[i] && (nums[i] + nums[k]) > nums[j]) {
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int [] nums = {2,2,3,4};
		System.out.println(triangleNumber(nums));
	}
}






