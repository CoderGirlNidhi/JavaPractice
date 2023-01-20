package com.nj.udemy.challenge;

public class PrimeNumber2 {
    public static void main(String[] args) {


        System.out.println(isPrime(29));
        countPrimeNos();
    }

    public static boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            //for(int i = 2; i <= n/2 ; i++) {

            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void countPrimeNos() {

        for (int i = 10, count = 0; count < 10; i++) {

            if (isPrime(i) == true) {

                count++;

                System.out.println( "Number " + i + " is a prime no");

                if(count == 10) {
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
    }
}
