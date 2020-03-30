package com.sportgames;

public class Hockey extends TeamGame {

    public Hockey() {
        super();
        this.duration = 60;
    }

    public Hockey(String team1, String team2) {
        super(team1, team2);
        this.duration = 60;
    }

    @Override
    public String getName() {
        return "Hockey";
    }
}
