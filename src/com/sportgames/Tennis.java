package com.sportgames;

public class Tennis extends IndividualSport{

    public Tennis() {
        super();
        this.duration = 90;
    }

    public Tennis(String player1, String player2) {
        super(player1, player2);
        this.duration = 90;
    }

    @Override
    public String getName() {
        return "Tennis";
    }
}
