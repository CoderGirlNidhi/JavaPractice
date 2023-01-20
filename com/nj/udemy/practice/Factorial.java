package com.nj.udemy.practice;

/* Implement a method to calculate Factorial in java.

- public static int calculateFactorial(int n);
- It should return -1, when n is less than 1 or more than 20.
- Is your approach Iterative or Recursive?
- Implement both. */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.calculateFactorial(5));
    }

    public static long calculateFactorial(int n) {
//        (5)! = 5 * 4 * 3 * 2 * 1;
//        (1)! = 1;
//        (0)! = Error
//        (20)! = Error (Question parameter indicates n > 20 -> error)

        return 0;
    }
}
