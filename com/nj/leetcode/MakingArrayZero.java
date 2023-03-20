package com.nj.leetcode;

// https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/


public class MakingArrayZero {
    // Time Complexity: O(n^2)
    public static int minimumOperations(int[] nums) {
        int count = 0;

        while (true) {
            int n = getMinElement(nums);
            if (n == 0) {
                break;
            }
            subtractEachElement(nums, n);
            count++;
        }
        return count;
    }

    // Subtracts n from each non-zero element of the array. O(n)
    private static void subtractEachElement(int[] arr, int n) {
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i] -= n;
            }
        }
    }

    // Returns the minimum non-zero elements of the array. O(n)
    private static int getMinElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num != 0 && num < min) {
                min = num;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    /*
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a: nums)
            if (a > 0)
                set.add(a);
        return set.size();
    }
    */

    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }
}
