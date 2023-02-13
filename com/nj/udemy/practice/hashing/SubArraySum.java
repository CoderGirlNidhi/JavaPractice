package com.nj.udemy.practice.hashing;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] a = { 10,2,-2,-20,10} ; // ans = 3
        int k = -10; // given

        HashMap<Integer,Integer> map = new HashMap<>(); // sum , freq = 2 integers
        map.put(0,1); // empty sub-array where we will store the sum and frequency in map

        int sum =0;
        int ans =0;

        for (int j = 0; j < a.length; j++) {
            sum += a[j];

            if(map.containsKey(sum - k)) {
                ans += map.get(sum-k);
            }

            if(map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            }else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
