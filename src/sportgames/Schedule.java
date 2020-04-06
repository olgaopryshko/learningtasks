package sportgames;

import sportgames.base.SportsGame;
import sportgames.individual.Badminton;
import sportgames.individual.Tennis;
import sportgames.participants.Person;
import sportgames.participants.Team;
import sportgames.team.Basketball;
import sportgames.team.Football;
import sportgames.team.Hockey;

public class Schedule {
    public static SportsGame scheduleGame(Weekday day) {
        SportsGame game = null;

        switch (day) {
            case MONDAY:
                System.out.println("Tennis game is scheduled");
                Person tennisPlayer1 = new Person("Yevgeny", "Kafelnikov");
                Person tennisPlayer2 = new Person("Andre", "Agassi");

                game = new Tennis(tennisPlayer1, tennisPlayer2);
                break;
            case TUESDAY:
                System.out.println("Football game is scheduled");
                Team footballTeam1 = new Team("PSG");
                Team footballTeam2 = new Team("Juventus");

                game = new Football(footballTeam1, footballTeam2);
                break;
            case WEDNESDAY:
                System.out.println("Day-off");
                break;
            case THURSDAY:
                System.out.println("Badminton game is scheduled");
                Person badmintonPlayer1 = new Person("Viktor", "Axelsen");
                Person badmintonPlayer2 = new Person("Dan", "Lin");

                game = new Badminton(badmintonPlayer1, badmintonPlayer2);
                break;
            case FRIDAY:
                System.out.println("Basketball game is scheduled");
                Team basketballTeam1 = new Team("Brooklyn");
                Team basketballTeam2 = new Team("New York Kniks");

                game = new Basketball(basketballTeam1, basketballTeam2);
                break;
            case SATURDAY:
                System.out.println("Hockey game is scheduled");
                Team hockeyTeam1 = new Team("Avangard");
                Team hockeyTeam2 = new Team("Metallurg");

                game = new Hockey(hockeyTeam1, hockeyTeam2);
                break;
            case SUNDAY:
                System.out.println("Day-off");
                break;
            default:
                System.out.println("Choose a weekday ");
        }

        return game;
    }
}


