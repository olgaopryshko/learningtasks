package sportgames.team;

import sportgames.participants.Team;

import java.util.*;

public class TeamList {

    List<Team> listBasketballTeams;
    List<Team> listFootballTeams;
    List<Team> listHockeyTeams;

    public TeamList() {
        listBasketballTeams = new ArrayList<>();
        listFootballTeams = new LinkedList<>();
        listHockeyTeams = new LinkedList<>();
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