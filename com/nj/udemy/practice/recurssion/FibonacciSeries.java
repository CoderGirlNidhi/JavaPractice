package com.nj.udemy.practice.recurssion;

//fibonacci series = sum of prev 2 integers = 0,1,1,2,3,5,8...
public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibSeries(0,1, n-2);
    }

    public static void fibSeries(int a , int b , int n) {

       if(n == 0) {
           return;
       }
        int c = a + b; // c = 0 + 1;, c = 1
        System.out.println(c);
        fibSeries(b, c, n-1);

    }



}
