package com.nj.leetcode;

// https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class LCTwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,6,12};
        int target = 28;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target ) {

        int[] result = new int[2];
        for(int i =0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] threeSum(int[] nums, int target ) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                 for(int k = j + 1; k < nums.length; k++){
                     if (nums[i] + nums[j] +nums[k] == target) {
                         return new int[]{i, j, k};
                     }
                 }
            }
        }
        return new int[]{-1, -1, -1};
    }
}

