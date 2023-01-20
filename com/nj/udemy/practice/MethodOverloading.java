package com.nj.udemy.practice;

public class MethodOverloading {

    public static void main(String[] args) {

        int newScore = calculateScore("Nidhi", 500);
        System.out.println("New score is  " + newScore);

        calculateScore(500);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " Score " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player" + " Score " + score + " points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("NO player name , no player score ");
        return 0;

    }
  }

