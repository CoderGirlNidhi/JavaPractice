package com.nj.udemy.practice.recurssion;
/*
Calculate x^n (stack height log n)
 */

public class CalculatePowerLog {

    public static void main(String[] args) {
        System.out.println(calcPower(2,5));
    }

    public static int calcPower(int x, int n ){

        //Base Condition
        if( n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        // Formula :
        //if n is even

        if( n  % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }

    }
}
