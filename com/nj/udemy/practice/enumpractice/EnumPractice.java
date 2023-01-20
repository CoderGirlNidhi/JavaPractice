package com.nj.udemy.practice.enumpractice;

import java.util.Random;

public class EnumPractice {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.FRI;
        System.out.println(weekDay);

        for(int i =  0 ; i < 10 ; i++ ) {
            weekDay = getRandomDay();
//             System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//
//             if(weekDay == DayOfTheWeek.FRI) {
//                 System.out.println("Found a FRI-YAY");
//             }

            switchDayOfTheWeek(weekDay);
        }

        for(var toppings  : Topping.values()) {
            System.out.println(toppings.name() + " : " + toppings.getPrice());
        }

    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekday) {
        int weekdayInteger = weekday.ordinal() + 1;

        switch(weekday) {
            case WED-> System.out.println("Wednesday is Day " + weekdayInteger);
            case SUN -> System.out.println("Sunday is Day " + weekdayInteger);
//            case MON -> System.out.println("Monday" + weekdayInteger);
//            case SAT -> System.out.println("Saturday" + weekdayInteger);
//            case TUES -> System.out.println("Tuesday" + weekdayInteger);
//            case THURS ->System.out.println("Thursday" + weekdayInteger);
            default -> System.out.println(weekday.name().charAt(0) + weekday.name().substring(1).toLowerCase() + "day is Day " + weekdayInteger);
        }
    }


    public static DayOfTheWeek getRandomDay() {
        int randomDay = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomDay];
    }
}
