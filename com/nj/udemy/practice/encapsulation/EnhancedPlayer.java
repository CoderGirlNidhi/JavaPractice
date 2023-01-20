package com.nj.udemy.practice.encapsulation;

public class EnhancedPlayer {

    private String fullName;
    private  String weapon;
    private int healthPercentage;

    public EnhancedPlayer(String fullName) {
        this(fullName, "Sword", 100  );
    }

    public EnhancedPlayer(String fullName, String weapon, int health) {
        this.fullName = fullName;
        this.weapon = weapon;

        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health >= 100) {
            this.healthPercentage = 100;
        }
    }
    public void loseHealth (int damage) {
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <=  0) {
            System.out.println("Player is knocked out of game ");
        }
    }
    public void restoreHealth (int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if(healthPercentage > 100) {
            System.out.println("Player restored to 100% ");
            healthPercentage = 100;
        }
    }

    public int healthReamaining () {
        return healthPercentage;

    }






}
