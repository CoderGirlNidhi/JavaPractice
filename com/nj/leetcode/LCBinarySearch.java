package com.nj.leetcode;
// https://leetcode.com/problems/binary-search/

public class LCBinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int i = start + ((end - start) / 2);

            if (nums[i] == target ) {
                return i;
            } else if (nums[i] > target) {
                end = i - 1;
            } else {
                start = i + 1;
            }
        }
        return -1;
    }
}
