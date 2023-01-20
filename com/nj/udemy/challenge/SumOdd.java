package com.nj.udemy.challenge;

public class SumOdd {

    public static void main(String[] args) {
        //   System.out.println(isOdd(20));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(11, 20));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            System.out.println("Invalid no");
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

//        if (!(start >= 0 && end >= 0 && end >= start)) {
//            return -1;
//        }
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            // System.out.println("The sum of odd nos are " + sum);
            return sum;
        }
    }


