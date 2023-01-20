package com.nj.udemy.challenge;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("The sum of input digits are " + sumDigits(125));
        System.out.println("The sum of input digits are " + sumDigits(-125));
        System.out.println("The sum of input digits are " + sumDigits(4));
        System.out.println("The sum of input digits are " + sumDigits(32123));
    }

  public static int sumDigits(int n) {
        if( n < 10) {
            return -1;
        }

        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int sumDigitsUsingFor(int n) {
        if (n < 10) {
            return -1;
        }

        int sum = 0;
        for (int i = n; i > 0; i = i / 10) {
            sum = sum + i % 10;
        }
        return sum;
    }
}