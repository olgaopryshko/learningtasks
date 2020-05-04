package sportgames.menu;

import sportgames.Schedule;
import sportgames.Weekday;
import sportgames.base.SportsGame;
import sportgames.exceptions.NoLastNameException;
import sportgames.exceptions.NotEnoughParticipantsException;
import sportgames.individual.PersonList;
import sportgames.participants.Person;
import sportgames.participants.Team;
import sportgames.team.TeamList;
import sportgames.utils.PropertiesRW;

import java.util.*;

public class Menu {

    private TeamList teamList = new TeamList();
    private PersonList personList = new PersonList();
    private Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
    private Schedule schedule = new Schedule(personList, teamList);

    public void printTeams(Collection<Team> teams) {
        System.out.println("Total teams: " + teams.size());
        for (Team t :
                teams) {
            System.out.println(t.getName());
        }
    }

    private void printPersons(Set<Person> personSet) {
        System.out.println("Total athletes: " + personSet.size());
        for (Person t :
                personSet) {
            System.out.println(t.getName());
        }
    }

    /**
     * Read the first and last name from the user and return a new Person object.
     *
     * @return null if no first name entered, a Person instance otherwise.
     */
    private Person inputPerson() {
        System.out.println("Enter player first name (Empty = stop):");
        String firstName = scanner.next();
        if (firstName.equals("")) {
            return null;
        }
        String lastName;
        while (true) {
            System.out.println("Enter player last name:");
            lastName = scanner.next();
            if (!lastName.equals("")) {
                break;
            }
            System.out.println("Please enter the last name!");
        }

        return new Person(firstName, lastName);
    }

    public void run() {
        try {

            while (true) {
                System.out.println("Choose an action: 1 - Enter data; 2 - Print data; 3 - Delete data; 4 - Play a random game;");
                System.out.println("5 - Read data from file; 6 - Save data to file;");
                System.out.println("7 - Load property value; 8 - Save property value;");
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
                    case 4:
                        playRandomGame();
                        System.out.println("Total games played: " + SportsGame.getTotalGamesPlayed());
                        break;
                    case 5:
                        loadData();
                        break;
                    case 6:
                        saveData();
                        break;
                    case 7:
                        loadProperty();
                        break;
                    case 8:
                        saveProperty();
                        break;
                    default:
                        System.out.println("Goodbye!");
                        return;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, select a number!");
        } finally {
            scanner.close();
        }
    }

    private void saveProperty() {
        System.out.println("Property name:");
        String propertyName = scanner.next();
        System.out.println("Property value:");
        String propertyValue = scanner.next();
        System.out.println("Properties file path:");
        String path = scanner.next();
        PropertiesRW.saveProperty(path, propertyName, propertyValue);
    }

    private void loadProperty() {
        System.out.println("Enter property name");
        String propertyName = scanner.next();
        System.out.println("Enter property file path");
        String path = scanner.next();
        String property = PropertiesRW.loadProperty(path, propertyName);
        System.out.println(property);

    }

    private void loadData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey; 4 - Tennis; 5 - Badminton;");
        int gameChoice = scanner.nextInt();
        System.out.println("Enter file path:");
        String filePath = scanner.next();
        switch (gameChoice) {
            case 1: // Football
                teamList.readFootballTeamsFromFile(filePath);
                break;
            case 2: //Basketball
                teamList.readBasketballTeamsFromFile(filePath);
                break;
            case 3: // Hockey
                teamList.readHockeyTeamsFromFile(filePath);
                break;
            case 4: // Tennis
                throw new RuntimeException("Not implemented yet");
            case 5: // Badminton
                throw new RuntimeException("Not implemented yet");
            default:
                System.out.println("Invalid input!");
        }
    }

    private void saveData() {
        System.out.println("Choose a game: 1 - Football; 2 - Basketball; 3 - Hockey; 4 - Tennis; 5 - Badminton;");
        int gameChoice = scanner.nextInt();
        System.out.println("Enter file path:");
        String filePath = scanner.next();
        switch (gameChoice) {
            case 1: // Football
                teamList.saveFootballTeamsToFile(filePath);
                break;
            case 2: //Basketball
                teamList.saveBasketballTeamsToFile(filePath);
                break;
            case 3: // Hockey
                teamList.saveHockeyTeamsToFile(filePath);
                break;
            case 4: // Tennis
                throw new RuntimeException("Not implemented yet");
            case 5: // Badminton
                throw new RuntimeException("Not implemented yet");
            default:
                System.out.println("Invalid input!");

        }
    }

    private void playRandomGame() {
        Weekday[] weekdays = Weekday.values();
        Weekday randomDay = weekdays[new Random().nextInt(weekdays.length)];
        try {
            SportsGame game = schedule.scheduleGame(randomDay);
            game.setRandomScore();
            game.play();
        } catch (NotEnoughParticipantsException e) {
            System.out.println("Game was not played: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No games played on " + randomDay);
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
                    Person person = inputPerson();
                    if (person == null) {
                        break;
                    }
                    personList.addTennisPlayer(person);
                }
                break;
            case 5: //Badminton
                while (true) {
                    Person person = inputPerson();
                    if (person == null) {
                        break;
                    }
                    personList.addBadmintonPlayer(person);
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
        String firstName;
        String lastName;
        try {
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
                    System.out.println("Enter player's first name");
                    firstName = scanner.next();
                    System.out.println("Enter player's last name");
                    lastName = scanner.next();
                    personList.removeTennisPlayer(new Person(firstName, lastName));
                    break;
                case 5: //Badminton
                    System.out.println("Enter player's first name");
                    firstName = scanner.next();
                    System.out.println("Enter player's last name");
                    lastName = scanner.next();
                    personList.removeBadmintonPlayer(new Person(firstName, lastName));
                    break;
                default:
                    System.out.println("Invalid input!");

            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
            scanner.next();
        } catch (IndexOutOfBoundsException | NoSuchElementException e) {
            System.out.println("There's no such index");
        }


    }
}

