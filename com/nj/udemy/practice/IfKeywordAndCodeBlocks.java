package com.nj.udemy.practice;

public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score< 5000 && score >1000 ) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score<1000) {
//            System.out.println("Score is less than 1000");
//
//        } else {
//                System.out.println("GOT HERE");
//            }

        if (gameOver == true) {
            int finalScore= score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is = " + finalScore);
        }

        // int savedFinalScore= finalScore; we cant access the variable outisde,  which is created inside the code block .

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("The new final score is = " + finalScore);
        }

    }
}
