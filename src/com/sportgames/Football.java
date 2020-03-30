package com.sportgames;

public class Football extends TeamGame {

    public Football() {
        super();
        this.duration = 90;
    }

    public Football(String team1, String team2) {
        super(team1, team2);
        this.duration = 90;
    }

    @Override
    public String getName() {
        return "Football";
    }

}
