package sportgames.base;

import sportgames.individual.PersonList;
import sportgames.participants.Person;
import sportgames.participants.Team;
import sportgames.team.TeamList;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class Menu {

    private TeamList teamList = new TeamList();
    private PersonList personList = new PersonList();
    private Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

    public void printTeams(Collection<Team> teams) {
        System.out.println("Total teams: " + teams.size());
        for (Team t :
                teams) {
            System.out.println(t.getName());
        }
    }

    private void printPersons(Set<Person> personSet) {
        System.out.println("Total ahtletes: " + personSet.size());
        for (Person t :
                personSet) {
            System.out.println(t.getName());
        }
    }


    public void run() {
        while (true) {
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
                    scanner.close();
                    return;
            }
        }
    }

    public void enterData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey; 4 - Tennis; 5 - Badminton;");
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
            case 4: //Tennis
                while (true) {
                    System.out.println("Enter player name (Empty = stop):");
                    String name = scanner.next();
                    if (name.equals("")) {
                        break;
                    }
                    personList.addTennisPlayer(new Person(name));
                }
                break;
            case 5: //Badminton
                while (true) {
                    System.out.println("Enter player name (Empty = stop):");
                    String name = scanner.next();
                    if (name.equals("")) {
                        break;
                    }
                    personList.addBadmintonPlayer(new Person(name));
                }
                break;
            default:
                System.out.println("Invalid input!");

        }
    }

    public void printData() {
        System.out.println("Choose a game: 0 - Everything; 1 - Football; 2 - Basketball; 3 - Hockey; 4 - Tennis; 5 - Badminton;");
        int gameChoice = scanner.nextInt();

        switch (gameChoice) {
            case 0: //Everything
                teamList.printAllTeams();
                personList.printAllPlayers();
                break;
            case 1: //Football
                printTeams(teamList.getListFootballTeams());
                break;
            case 2: //Basketball
                printTeams(teamList.getListBasketballTeams());
                break;
            case 3: //Hockey
                printTeams(teamList.getListHockeyTeams());
                break;
            case 4: //Tennis
                printPersons(personList.getSetOfTennisPlayers());
                break;
            case 5: //Badminton
                printPersons(personList.getSetOfBadmintonPlayers());
                break;
            default:
                System.out.println("Invalid input!");

        }
    }


    public void deleteData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey; 4 - Tennis; 5 - Badminton");
        int gameChoice = scanner.nextInt();
        int index;
        String name;

        switch (gameChoice) {
            case 1: //Football
                System.out.println("Enter index (0-" + (teamList.getListFootballTeams().size() - 1) + ")");
                index = scanner.nextInt();
                teamList.removeFootballTeam(index);
                break;
            case 2: //Basketball
                System.out.println("Enter index (0-" + (teamList.getListBasketballTeams().size() - 1) + ")");
                index = scanner.nextInt();
                teamList.removeBasketballTeam(index);
                break;
            case 3: //Hockey
                System.out.println("Enter index (0-" + (teamList.getListHockeyTeams().size() - 1) + ")");
                index = scanner.nextInt();
                teamList.removeHockeyTeam(index);
                break;
            case 4: //Tennis
                System.out.println("Enter player's name");
                name = scanner.next();
                personList.removeTennisPlayer(new Person(name));
                break;
            case 5: //Badminton
                System.out.println("Enter player's name");
                name = scanner.next();
                personList.removeBadmintonPlayer(new Person(name));
                break;
            default:
                System.out.println("Invalid input!");

        }
    }


}

