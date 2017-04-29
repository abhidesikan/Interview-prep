package com.abhidesikan.interviewprep.BigO;

/**
 * Created by abhidesikan on 11/2/16.
 */
public class GroupSum {

    public boolean groupSum(int start, int[] nums, int target) {
        System.out.println("start " + start +  " target " + target );
        if(start >= nums.length) {
            return (0 == target);
        }
        if(groupSum(start+1, nums, target-nums[start])) {
            return true;
        }
        if(groupSum(start+1, nums, target)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        GroupSum groupSum = new GroupSum();
        int [] nums = {2,4,8};
        System.out.println(groupSum.groupSum(0, nums, 10));
    }
}
