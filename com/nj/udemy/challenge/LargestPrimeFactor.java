package com.nj.udemy.challenge;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                int c = n / i;
                if (isPrime(c)) {
                    return c;
                }
            }
        } return -1;
    }

    public static boolean isPrime(int n){
        for( int i = 2; i < n/2; i++) {
            if( n % i ==0) {
                return false;
            }
        } return true;
    }
}
