package com.sportgames;

public abstract class TeamGame extends SportsGame{

    public String team1 = "team name1";
    public String team2 = "team name2";

    public TeamGame(){}

    public TeamGame(String team1, String team2) {
        super();
        this.team1 = team1;
        this.team2 = team2;
    }
}
