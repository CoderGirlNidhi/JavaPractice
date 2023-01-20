package com.nj.udemy.practice;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2019;

        if (year % 400 == 0) {
            System.out.println("This year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("This year is not a Leap Year");
        } else if (year % 4 == 0){
            System.out.println(" This year is a Leap Year");
        } else {
            System.out.println("This is not a Leap Year");
        }
    }
}
