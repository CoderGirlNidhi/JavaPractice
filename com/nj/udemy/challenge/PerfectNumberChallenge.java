package com.nj.udemy.challenge;

public class PerfectNumberChallenge {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber (int num) {
        if( num < 1) {
            return false;
        }
        int sum = 0;
     for( int i = 1 ; i <= num/2; i++) {

         if( num % i == 0) {
             sum = sum + i;
             //System.out.println(sum);
         }
         }
        return num == sum;
     }
    }

