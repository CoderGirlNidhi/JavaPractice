package com.nj.udemy.practice.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
//        int[] a = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] a = {1,2};
        majorityElementInArray(a);
    }

    public static void majorityElementInArray(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int frequency = 0;
        int n = a.length;

        for (int i : a) {
            if (map.containsKey(i)) { //true
                frequency = map.get(i);
                frequency++;
                map.put(i, frequency);
            } else { // false
                map.put(i, 1);
            }
        }
        for (int i : map.keySet()){
                if(map.get(i) > n/3){
                System.out.println("Majority element = " + i + " Frequency = " + frequency);
            }
        }
    }
}
