package sportgames.exe;

import sportgames.participants.Team;
import sportgames.team.TeamList;

import java.util.Collection;
import java.util.Scanner;

public class Executor {

    private static TeamList teamList = new TeamList();
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

    public static void printTeams(Collection<Team> teams) {
        System.out.println("Total teams: " + teams.size());
        for (Team t :
                teams) {
            System.out.println(t.getName());
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Choose an action: 1 - Enter data; 2 - Print data; 3 - Delete data");
            System.out.println("Any other number - exit program");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    enterData();
                    break;
                case 2:
                    printData();
                    break;
                case 3:
                    deleteData();
                    break;
                default:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }

    public static void enterData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey;");
        int gameChoice = scanner.nextInt();

        switch (gameChoice) {
            case 1: //Football
                while (true) {
                    System.out.println("Enter team name (Empty = stop):");
                    String name = scanner.next();
                    if (name.equals("")) {
                        break;
                    }
                    teamList.addFootballTeam(new Team(name));
                }
                break;
            case 2: //Basketball
                while (true) {
                    System.out.println("Enter team name (Empty = stop):");
                    String name = scanner.next();
                    if (name.equals("")) {
                        break;
                    }
                    teamList.addBasketballTeam(new Team(name));
                }
                break;
            case 3: //Hockey
                while (true) {
                    System.out.println("Enter team name (Empty = stop):");
                    String name = scanner.next();
                    if (name.equals("")) {
                        break;
                    }
                    teamList.addHockeyTeam(new Team(name));
                }
                break;
            default:
                System.out.println("Invalid input!");

        }
    }

    public static void printData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey;");
        int gameChoice = scanner.nextInt();

        switch (gameChoice) {
            case 1: //Football
                printTeams(teamList.getListFootballTeams());
                break;
            case 2: //Basketball
                printTeams(teamList.getListBasketballTeams());
                break;
            case 3: //Hockey
                printTeams(teamList.getListHockeyTeams());
                break;
            default:
                System.out.println("Invalid input!");

        }
    }

    public static void deleteData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey;");
        int gameChoice= scanner.nextInt();
        int index;

        switch (gameChoice) {
            case 1: //Football
                System.out.println("Enter index (0-" + (teamList.getListFootballTeams().size()-1) + ")");
                index = scanner.nextInt();
                teamList.removeFootballTeam(index);
                break;
            case 2: //Basketball
                System.out.println("Enter index (0-" + (teamList.getListBasketballTeams().size()-1) + ")");
                index =scanner.nextInt();
                teamList.removeBasketballTeam(index);
                break;
            case 3: //Hockey
                System.out.println("Enter index (0-" + (teamList.getListHockeyTeams().size()-1) + ")");
                index =scanner.nextInt();
                teamList.removeHockeyTeam(index);
                break;
            default:
                System.out.println("Invalid input!");

        }
    }




}