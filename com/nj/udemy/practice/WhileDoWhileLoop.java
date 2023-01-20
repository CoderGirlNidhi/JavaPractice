package com.nj.udemy.practice;

public class WhileDoWhileLoop {
    /*
        Calculate sum of all odd numbers in the range given (start, end) and print it. Start and End are inclusive.
        Assume the input is always valid. start > 0, end > 0 and end > start.
     */
    public static void main(String[] args) {
        printOddSumFor(1, 7);
        printOddSumWhile(1, 7);
        printOddSumDoWhile(1, 7);
    }

    public static void printOddSumFor(int start, int end) {
        int sum =0;
        for(int i = start; i <= end; i++ ) {
            if(i % 2 != 0) {
                sum= sum + i;
            }
        }
        System.out.println("For " + sum);
    }

    public static void printOddSumWhile(int start, int end) {
        int sum = 0;
        while(start <= end ) {

            if(isOdd(start)) {
                sum = sum +start;
            }
            start++;
        }
        System.out.println("While " + sum);
    }

    public static void printOddSumDoWhile(int start, int end) {
        int sum = 0;
        do{
            if(start % 2 != 0) {
                sum = sum + start;
            }
            start++;
        } while(start <= end);
        System.out.println("Do While " + sum);
    }

    public static boolean isOdd(int number) {
       if (number < 1) {
           return false;
       }
       return number % 2 == 1;
    }
}
