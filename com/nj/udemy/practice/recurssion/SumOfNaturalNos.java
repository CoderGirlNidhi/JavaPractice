package com.nj.udemy.practice.recurssion;

public class SumOfNaturalNos {

    public static void main(String[] args) {
       printSum(5, 0);
    }

    public static void printSum(int n, int sum ) {

        if(n == 0) {
//            sum = sum+n;
            System.out.println(sum);
            return;
        }

        sum = sum+n;
        printSum(n-1, sum);
    }
}
