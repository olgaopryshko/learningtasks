package sportgames.exe;

import sportgames.base.Menu;

public class Executor {
    /*
    public static void main(String[] args) {

        Weekday day = Weekday.FRIDAY;

        SportsGame game = Schedule.scheduleGame(day);

        game.setScore1(3);
        game.setScore2(2);

        game.play();

        day = Weekday.SUNDAY;

        game = Schedule.scheduleGame(day);
        game.setScore1(1);
        game.setScore2(1);

        game.play();

    }
    */


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}