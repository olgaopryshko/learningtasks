package com.sportgames;

public class Badminton extends IndividualSport {

    public Badminton() {
        super();
        this.duration = 60;
    }

    public Badminton(String player1, String player2) {
        super(player1, player2);
        this.duration = 60;
    }

    @Override
    public String getName() {
        return "Badminton";
    }
}
