package com.main;

import com.sportgames.Football;
import com.sportgames.Tennis;

public class Executor {

    public static void main(String[] args)
    {
        Football football = new Football("Arsenal", "Manchester");

        football.play();

        football.setScore1(2);
        football.setScore2(1);

        System.out.println(football.team1 + " - " + football.team2);
        System.out.println("Score: " + football.getScore1() + ":" + football.getScore2());


        Tennis tennis = new Tennis("N. Djokovic", "R. Nadal");

        tennis.play();

        tennis.setScore2(2);

        System.out.println(tennis.getPlayer1()+ " - " + tennis.getPlayer2());
        System.out.println("Score: " + tennis.getScore1() + ":" + tennis.getScore2());
    }

}
