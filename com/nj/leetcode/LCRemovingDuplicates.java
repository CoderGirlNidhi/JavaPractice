package com.nj.leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Arrays;

public class LCRemovingDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int i = 0;
        int val = -101;

        for(int j = 0; j < nums.length; j++) {
            if (nums[j] != val ) {
               nums[i] = nums[j];
               val = nums[i];
               i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }

}
