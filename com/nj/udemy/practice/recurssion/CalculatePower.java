package com.nj.udemy.practice.recurssion;
/*
x^n = x * x * x * x.......nth time.
x^n = x * x^n-1 ;
base condition = n == 0 => x^0 = 1;
x == 0 ; return 1
Calculate x^n (stack height n)

 */
public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(calcPower(2, 5));
    }

    public static int calcPower(int x, int n) {
        //Base Condition
        if( n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        // Formula :

        int power = x * calcPower(x , n-1);
        return power;

    }
}
