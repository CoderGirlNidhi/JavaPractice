package com.nj.leetcode;

//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1 , int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for (int k : nums1) {
            set1.add(k);
        }

        for (int k : nums2) {
            if (set1.contains(k)) {
                set2.add(k);
            }
        }
       int[] array = new int[set2.size()];
        int j = 0;
        for (int i : set2){
            array[j++] = i;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
//        intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
