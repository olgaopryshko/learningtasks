package com.sportgames;

public class Executor {

    public static void main(String[] args)
    {
        Football football = new Football("Arsenal", "Manchester");

        football.setScore1(2);
        football.setScore2(1);

        System.out.println(football.team1 + " - " + football.team2);
        System.out.println("Score: " + football.getScore1() + ":" + football.getScore2());


        Tennis tennis = new Tennis("N. Djokovic", "R. Nadal");

        tennis.setScore2(2);

        System.out.println(tennis.player1+ " - " + tennis.player2);
        System.out.println("Score: " + tennis.getScore1() + ":" + tennis.getScore2());
    }

}
