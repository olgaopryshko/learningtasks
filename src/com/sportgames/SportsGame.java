package com.sportgames;

public abstract class SportsGame extends Game implements IPlayable {
    public int duration = 0;

    private int score1 = 0;
    private int score2 = 0;

    public SportsGame(){}

    public SportsGame(int duration)
    {
        this.duration = duration;
    }

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

    @Override
    public void play() {
        System.out.println("A game of " + this.getName() + " was played");
    }

    public abstract String getName();

}

