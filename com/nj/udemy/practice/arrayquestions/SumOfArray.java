package com.nj.udemy.practice.arrayquestions;

// sum of all elements in an array

public class SumOfArray {

    public static void main(String[] args) {
        int[] a = {2,4,6,8,9};
        sum(a);
    }

    public static void sum(int[] a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        System.out.println("The sum of all the elements of array is = " + sum);
    }
}
