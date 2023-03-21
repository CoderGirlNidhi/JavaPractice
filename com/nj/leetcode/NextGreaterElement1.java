package com.nj.leetcode;

//https://leetcode.com/problems/next-greater-element-i/description/

import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElement1 {

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

//        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    // Time: O(n^2) , Space: O(n)
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Arrays.fill(arr, -1);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        for (int i = 0 ; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[index] < nums2[k]) {
                    arr[i] = nums2[k];
                    break;
                }
            }

        }
        return arr;
    }
}
