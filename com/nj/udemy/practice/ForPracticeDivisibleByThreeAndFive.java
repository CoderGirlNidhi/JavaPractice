package com.nj.udemy.practice;

public class ForPracticeDivisibleByThreeAndFive {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for(int i=1; i <= 1000 ;  i++) {

            if( (i % 3 == 0) && (i % 5 ==0) ) {

                System.out.println("The no divisible by 3 & 5 is " + i);
                count ++;
                sum = sum + i;

                if (count == 5)
                {
                   break;
                }
            }
        }
        System.out.println("The sum of numbers divible by 3 and 5 is " + sum);
    }
}