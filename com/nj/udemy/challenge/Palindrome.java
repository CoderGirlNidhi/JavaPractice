package com.nj.udemy.challenge;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

    }

    public static boolean isPalindrome (int number) {

        int reverse =0;
        int num = Math.abs(number);

        while (num > 0) {
        int ld  = num % 10;
        num = num / 10;
        reverse = (reverse*10) + ld;
        }

        if(Math.abs(number) == reverse) {
            System.out.println("The given no " + number + " is palindrome ");
            return true;
        }
            return false;

    }


}