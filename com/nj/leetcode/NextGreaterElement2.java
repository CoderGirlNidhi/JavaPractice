package com.nj.leetcode;

//https://leetcode.com/problems/next-greater-element-ii/description/

import java.util.Arrays;

public class NextGreaterElement2 {
    public static void main(String[] args) {

        int[] nums3 = {1,8,-1,-100,-1,222,1111111,-111111};
//        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(nextGreaterElementII(nums3)));
    }


    public static int[] nextGreaterElementII(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, Integer.MAX_VALUE);

        for (int i = 0 ; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    arr[i] = nums[j];
                    break;
                }
            }

            for (int j = 0; j < i && arr[i] == Integer.MAX_VALUE; j++) {
                if (nums[i] < nums[j]) {
                    arr[i] = nums[j];
                    break;
                }
            }

            if (arr[i] == Integer.MAX_VALUE) {
                arr[i] = -1;
            }
        }
        return arr;
    }
}
