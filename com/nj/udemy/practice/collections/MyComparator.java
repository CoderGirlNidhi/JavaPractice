package com.nj.udemy.practice.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Seat> {
    @Override
    public int compare(Seat o1, Seat o2) {
        // o1 -> A3, o2  -> B2
//        char[] o1Array = o1.getSeatName().toCharArray();
//        char[] o2Array = o2.getSeatName().toCharArray();
//        int o1Value = o1Array[1];
//        int o2Value = o2Array[1];
//        return o1Value - o2Value;

        return o1.getSeatName().compareToIgnoreCase(o2.getSeatName());
    }
}