package com.nj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection1(nums1, nums2)));
    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0 ) {
            return new int[0];
        }

        Arrays.sort(nums1); // 4,5,9
        Arrays.sort(nums2); // 4,4,8,9,9
        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;


        while (len1 > 0 && len2 > 0) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                len1--;
                j++;
                len2--;
            }else if (nums1[i] < nums2[j]) {
                i++;
                len1--;
            } else {
                j++;
                len2--;
            }
        }
        return listToArray(list);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0 ; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
