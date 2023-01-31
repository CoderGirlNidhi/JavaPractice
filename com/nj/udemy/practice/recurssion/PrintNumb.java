package com.nj.udemy.practice.recurssion;

public class PrintNumb {
    public static void main(String[] args) {
        printNosAsc(1);
        System.out.println("************");
        printNosDes(5);
    }


    public static void printNosAsc(int n) {
        //asc order
        if(n==6) {
            return;
        }
        System.out.println(n);
        printNosAsc(n+1);
    }

    public static void printNosDes(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNosDes(n-1);
    }
}
