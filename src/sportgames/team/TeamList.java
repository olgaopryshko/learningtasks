package sportgames.team;

import sportgames.participants.Team;

import java.util.*;

public class TeamList {

    List<Team> listBasketballTeams;
    List<Team> listFootballTeams;
    List<Team> listHockeyTeams;
    Map<String, List<Team>> mapCollections;

    public TeamList() {
        listBasketballTeams = new ArrayList<>();
        listFootballTeams = new LinkedList<>();
        listHockeyTeams = new LinkedList<>();
        mapCollections = new HashMap<>();

        mapCollections.put("football", listFootballTeams);
        mapCollections.put("basketball", listBasketballTeams);
        mapCollections.put("hockey", listHockeyTeams);
    }

    /**
     * Print all teams playing all sports
     */
    public void printAllTeams() {
        for (String sport :
                mapCollections.keySet()) {
            System.out.println("Teams playing " + sport + ":");
            List<?> list = mapCollections.get(sport);
            if (list.size() == 0) {
                System.out.println("[none]");
            } else {
                for (Object team : list) {
                    System.out.println(team.toString());
                }
            }
        }
    }


    public void addFootballTeam(Team team) {
        listFootballTeams.add(team);
    }

    public void removeFootballTeam(int index) {
        listFootballTeams.remove(index);
    }

    public void addBasketballTeam(Team team) {
        listBasketballTeams.add(team);
    }

    public void removeBasketballTeam(int index) {
        listBasketballTeams.remove(index);
    }

    public void addHockeyTeam(Team team) {
        listHockeyTeams.add(team);
    }

    public void removeHockeyTeam(int index) {
        listHockeyTeams.remove(index);
    }

    public List<Team> getListFootballTeams() {
        return listFootballTeams;
    }

    public List<Team> getListBasketballTeams() {
        return listBasketballTeams;
    }

    public List<Team> getListHockeyTeams() {
        return listHockeyTeams;
    }


}