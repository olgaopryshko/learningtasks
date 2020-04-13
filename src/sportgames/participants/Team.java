package sportgames.participants;

import sportgames.team.Football;

public final class Team extends Football implements IParticipant {

    private String name;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}

