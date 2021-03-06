package sportgames.base;

import sportgames.participants.IParticipant;

import java.util.Random;

public class SportsGame extends Game implements IPlayable {

    private static int totalGamesPlayed = 0;

    private final int MAX_RANDOM_SCORE = 10;

    private int score1 = 0;
    private int score2 = 0;

    protected IParticipant player1;
    protected IParticipant player2;

    protected String gameName;

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

    public String getGameName() {
        return gameName;
    }

    public static int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public void setRandomScore() {
        Random r = new Random();
        score1 = r.nextInt(MAX_RANDOM_SCORE);
        score2 = r.nextInt(MAX_RANDOM_SCORE);
    }

    @Override
    public final void play() {
        System.out.println("A game of " + gameName + " was played");
        System.out.println(player1.getName() + " vs " + player2.getName());
        System.out.println("Score: " + score1 + "-" + score2);
        this.gameOver();
        totalGamesPlayed++;
    }


}

