package sportgames.exe;

import sportgames.Olympics;
import sportgames.participants.Person;
import sportgames.individual.Tennis;
import sportgames.participants.Team;
import sportgames.team.Football;

public class Executor {

    public static void main(String[] args)
    {
        Olympics olympics = new Olympics();

        Person tennisPlayer1 = new Person("Yevgeny", "Kafelnikov");
        Person tennisPlayer2 = new Person("Andre", "Agassi");

        Tennis tennis = new Tennis(tennisPlayer1, tennisPlayer2);

        tennis.setScore1(1);
        tennis.setScore2(2);

        olympics.setGame(tennis);
        olympics.playGame();

        Team footballTeam1 = new Team("PSG");
        Team footballTeam2 = new Team("Juventus");

        Football football = new Football(footballTeam1,footballTeam2);

        football.setScore1(3);
        football.setScore2(2);

        olympics.setGame(football);
        olympics.playGame();

    }

}
