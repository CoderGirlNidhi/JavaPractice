package com.nj.udemy.challenge;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int n) {
        if( n < 0 ) {
            //System.out.println("Invalid Value");
            return -1;
        }
        int sum = 0 ;
        while ( n > 0) {
            int ld = n % 10 ;
            if( ld % 2 == 0) {
                sum = sum + ld ;
            }
            n = n / 10;
        }
        return sum;
    }

}
