package com.nj.udemy.challenge;

public class SecondsAndMinute {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(int min, int sec) {

        if (min < 0 || (sec < 0 || sec > 59)) {
            //return "Invalid Value";
            return INVALID_VALUE_MESSAGE;

        }

        int h = min / 60;
        int m = min % 60;

//        printTime(h, m, sec);

        // how to add 0 in all the three parameters - hours, minutes and seconds
        String hourString = h + "h";
        if (h < 10) {
            hourString = "0" + hourString;
        }

        String remianingMinutes = m + "m";
        if (m < 10) {
            remianingMinutes = "0" + remianingMinutes;
        }

        String remianingSeconds = sec + "s";
        if (sec < 10) {
            remianingSeconds = "0" + remianingSeconds;
        }

        return hourString + " " + remianingMinutes + " " + remianingSeconds;

        //  return h + "h " + m + "m " + sec + "s";
    }

    public static String getDurationString(int sec) {

        if (sec < 0) {
//            return "Invalid Value";
            return INVALID_VALUE_MESSAGE;
        }
            int m = sec / 60;
            int s = sec % 60;

            return getDurationString(m, s);


        }
//
//        public static void printTime( int h, int m, int s) {
//            String hourStr = String.format("%02d", h);
//            String minStr = String.format("%02d", m);
//            String secStr = String.format("%02d", s);
//            System.out.println(hourStr + "h " + minStr + "m " + secStr + "s");
//        }
    }
