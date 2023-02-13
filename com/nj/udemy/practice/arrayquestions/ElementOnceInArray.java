package com.nj.udemy.practice.arrayquestions;


//find the element that appears only once in the array and rest all appears twice in array.


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElementOnceInArray {
    public static void main(String[] args) {
        int[] a = {5,3,4,2,3,4,5};
        searchElement(a); // hashmap method
        searchElement2(a); // using xor method
    }

    public static void searchElement(int[] a) {
        int count = 0;
        int temp = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if(map.containsKey(i)) {
                count= map.get(i);
                count++;
                map.put(i, count);
                temp = i;
            }else {
                map.put(i,1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(value == 1) {
                System.out.println("The element that appears once is " + key);
            }
        }
    }

    public static void searchElement2(int[] a) {

        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = result ^ a[i];
        }
        System.out.println("he element that appears once is " + result);
    }
}
