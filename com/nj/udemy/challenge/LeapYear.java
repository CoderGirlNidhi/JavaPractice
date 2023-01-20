package com.nj.udemy.challenge;

public class LeapYear {

    public static void main(String[] args) {
//        System.out.println(isLeapYear(1700));
//        System.out.println(isLeapYear(1800));
//        System.out.println(isLeapYear(1900));
//        System.out.println(isLeapYear(2100));
//        System.out.println(isLeapYear(2200));
//        System.out.println(isLeapYear(2300));
//        System.out.println(isLeapYear(2500));
//        System.out.println(isLeapYear(2600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(2400));
//        System.out.println(isLeapYear(2800));
//        System.out.println(isLeapYear(-2400));
        System.out.println(isLeapYear(2002));
        System.out.println(isLeapYear(2010));
//        System.out.println(isLeapYear(2012));
//        System.out.println(isLeapYear(2016));
//        System.out.println(isLeapYear(2017));


    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 400 == 0) {
                System.out.println(year + " This year is a leap year");
                return true;
            } else if (year % 100 == 0) {
                System.out.println(year + " This year is a not leap year");
                return false;
            } else if (year % 4 == 0) {
                System.out.println(year + " This year is a leap year");
                return true;
            }
        } else {
            System.out.println(year + " This year is not in range");
            return false;
        }
        return false;
    }
}