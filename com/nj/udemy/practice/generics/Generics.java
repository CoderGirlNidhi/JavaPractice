package com.nj.udemy.practice.generics;

public class Generics {
    public static void main(String[] args) {

        FootballPlayer p1 = new FootballPlayer("Gaurav");
        BaseballPlayer b1 = new BaseballPlayer(("Nidhi"));
        SoccerPlayer s1 = new SoccerPlayer("Joe");

        Team<FootballPlayer> rajasthanRoyals = new Team<> ("Rajasthan Royals");
        rajasthanRoyals.addPlayer(p1);
//        t1.addPlayer(b1);
//        t1.addPlayer(s1);

        Team <BaseballPlayer> mumbaiIndians = new Team<>("Mumbai Indians");
        mumbaiIndians.addPlayer(b1);

//        Team <String> brokenTeam  = new Team<>("This wont work ");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> kolkataNightriders = new Team<>("Kolkata Nightriders");
        kolkataNightriders.addPlayer(s1);
//        System.out.println(t1.numPlayers()); // print the size of the team

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer bank = new FootballPlayer("Gordon");
        melbourne.addPlayer(bank);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team("Fremantle");

//        hawthorn.matchResult(fremantle,1,0, true);
//        hawthorn.matchResult(rajasthanRoyals,3, 8 , true);
//
//        rajasthanRoyals.matchResult(hawthorn, 4, 7, true);
////        rajasthanRoyals.matchResult(mumbaiIndians, 3, 5, true);
//// As we have not yet restricted our team to only football players - Wrong statement as MI is of baseball team type
//
//        System.out.println("Rankings");
//        System.out.println(rajasthanRoyals.getName() + " : " + rajasthanRoyals.ranking());
//        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
//
//        System.out.println(rajasthanRoyals.compareTo(hawthorn));

        League<Team <FootballPlayer>> league = new League("IPL");
        league.add(rajasthanRoyals);
        league.add(hawthorn);
        league.add(rajasthanRoyals);
        league.add(fremantle);
        league.add(melbourne);
        league.showLeagueTable();

//        Team rawTeam = new Team<>("Raw Team");
//        rawTeam.addPlayer(b1);
//        rawTeam.addPlayer(s1);
//
//        league.add(rawTeam);
//
//        League<Team> rawLeague = new League<>("Raw");
//        rawLeague.add(rajasthanRoyals); //no warning
//        rawLeague.add(mumbaiIndians);
//        rawLeague.add(kolkataNightriders);
//
//        League reallyRaw = new League("Really Raw");
//        reallyRaw.add(rajasthanRoyals);
//        reallyRaw.add(mumbaiIndians);
//        reallyRaw.add(kolkataNightriders);

    }
}
