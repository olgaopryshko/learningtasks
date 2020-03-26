package com.sportgames;

public class SportsGame extends Game {
    public int duration = 0;

    private int score1 = 0;
    private int score2 = 0;

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public SportsGame(){}

    public SportsGame(int duration)
    {
        this.duration = duration;
    }
}

