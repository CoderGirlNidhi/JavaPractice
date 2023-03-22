package com.nj.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MovingAverageFromDataStream {
    public static void main(String[] args) {
        int size = 3;
        MovingAverage movingAverage = new MovingAverage(size);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}

class MovingAverage {
    int maxSize;
    private final List<Integer> list;
    private double sum ;
    public MovingAverage(int size) {
        this.maxSize = size;
        this.sum = 0.0;
        this.list = new ArrayList<>();

    }

    public double next(int val) {

        if(list.size() == maxSize) {
            sum -= list.remove(0);
        }
        list.add(val);
        sum += val;
        return sum / list.size();
    }
}
