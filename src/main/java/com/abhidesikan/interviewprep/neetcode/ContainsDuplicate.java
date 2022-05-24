package com.abhidesikan.interviewprep.neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set duplicate = new HashSet();

        for (int i : nums) {
            if (duplicate.contains(i)) {
                return true;
            } else {
                duplicate.add(i);
            }
        }
        return false;
    }
}
