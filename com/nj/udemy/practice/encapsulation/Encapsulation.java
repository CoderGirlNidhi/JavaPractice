package com.nj.udemy.practice.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Player player =new Player();
        //as the feilds are set to public initially , we can set the values directly
//        player.name = "Nidhi";
//        player.health= 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHealth(10);
//        System.out.println("Remaining Health =  " + player.healthReamaining());
//        player.loseHealth(11);
//        System.out.println("Remaining Health =  " + player.healthReamaining());

        EnhancedPlayer nidhi = new EnhancedPlayer("Nidhi", "Sword", 200);
        System.out.println( "Initial Health is " + nidhi.healthReamaining());





    }
}