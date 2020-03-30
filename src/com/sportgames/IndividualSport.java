package com.sportgames;

public abstract class IndividualSport extends SportsGame {

    private String player1 = "player 1";
    private String player2 = "player 2";

    public IndividualSport(){}

    public IndividualSport(String player1, String player2){
        super();
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getPlayer1() {
        return player1;
    }
}

