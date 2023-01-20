package com.nj.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/remove-element/

public class LCRemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int[] nums = {3,2,2,3};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val ) {
        System.out.println(Arrays.toString(nums));
        int i=0;
        for(int j = 0; j < nums.length; j++) {

            if( nums[j] != val ) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}

