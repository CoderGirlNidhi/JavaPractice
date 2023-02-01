package com.nj.udemy.practice.generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player> implements Comparable<Team<T>>{

    private final String name;
    int played = 0;
    int win = 0;
    int lost = 0;
    int tied = 0;

    ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already present in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team <T> opponent, int myScore, int theirScore, boolean updateOpponentTeamScore) {

        String message;

        if(myScore > theirScore) {
            win++;
            message = " beat ";
        } else if (myScore == theirScore) {
            tied++;
            message = " drew with ";
        }else {
            lost++;
            message = " lost to ";
        }
        played ++;// to count no of matches
        System.out.println(this.getName() + message + opponent.getName());

        if(updateOpponentTeamScore) {
            opponent.matchResult(this, theirScore, myScore, false);
        }
    }

    public int ranking() {
        return (win * 2) + tied;
    }


    public int compareTo( Team<T> team) {
       if(this.ranking() > team.ranking()) {
           return -1;
       } else if (this.ranking() < team.ranking()) {
           return -1;
       }
        return 0;
    }

























}
