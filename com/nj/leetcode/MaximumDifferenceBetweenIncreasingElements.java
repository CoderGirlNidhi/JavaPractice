/*
https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j]
(i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
Return the maximum difference. If no such i and j exists, return -1.

 */

package com.nj.leetcode;

public class MaximumDifferenceBetweenIncreasingElements {

    public static int maximumDifference(int[] nums) {

        int maximumDifference = -1;

        for(int i = 0; i < nums.length ; i++) {
            for(int j= i+1; j < nums.length ; j++) {

                if( (i < j) && (nums[j] > nums[i])) {
                    int difference= nums[j] - nums[i];

                    if(maximumDifference < difference) {
                        maximumDifference = difference;
                    }
                }
            }
        }
        return maximumDifference;
    }

    public static void main(String[] args) {

        int[] nums = {7,1,5,4};
        System.out.println("Max Difference = " + maximumDifference(nums));
    }
}
