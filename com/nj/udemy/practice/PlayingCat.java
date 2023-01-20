package com.nj.udemy.practice;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temp) {
        boolean isCatPlayingInSummer = (summer && (temp >= 25 && temp <= 45));
        boolean isCatPlayingWithoutSummer = (!summer && (temp >= 25 && temp <= 35));
        return isCatPlayingInSummer || isCatPlayingWithoutSummer;
    }
}