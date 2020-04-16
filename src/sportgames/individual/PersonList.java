package sportgames.individual;

import sportgames.participants.Person;

import java.util.*;

public class PersonList {
    Set<Person> setOfBadmintonPlayers;
    Set<Person> setOfTennisPlayers;
    Map<String, Set<Person>> mapPersonCollection;

    public PersonList() {
        setOfBadmintonPlayers = new HashSet<Person>();
        setOfTennisPlayers = new HashSet<Person>();
        mapPersonCollection = new HashMap<String, Set<Person>>();

        mapPersonCollection.put("badminton", setOfBadmintonPlayers);
        mapPersonCollection.put("tennis", setOfTennisPlayers);
    }

    public void addBadmintonPlayer(Person person) {
        setOfBadmintonPlayers.add(person);
    }

    public void removeBadmintonPlayer(Person personToRemove) {
        for (Person person : setOfBadmintonPlayers) {
            if (person.getName().equals(personToRemove.getName())) {
                setOfBadmintonPlayers.remove(person);
                break;
            }
        }


    }

    public void addTennisPlayer(Person person) {
        setOfTennisPlayers.add(person);
    }

    public void removeTennisPlayer(Person personToRemove) {
        for (Person person : setOfTennisPlayers) {
            if (person.getName().equals(personToRemove.getName())) {
                setOfTennisPlayers.remove(person);
                break;
            }

        }
    }

    public Set<Person> getSetOfBadmintonPlayers() {
        return setOfBadmintonPlayers;
    }

    public Set<Person> getSetOfTennisPlayers() {
        return setOfTennisPlayers;
    }


    /**
     * Print all athletes playing all sports
     */
    public void printAllPlayers() {
        for (String sport :
                mapPersonCollection.keySet()) {
            System.out.println("Athletes playing " + sport + ":");
            Set<?> set = mapPersonCollection.get(sport);
            if (set.size() == 0) {
                System.out.println("[none]");
            } else {
                for (Object team : set) {
                    System.out.println(team.toString());
                }
            }
        }
    }
}
