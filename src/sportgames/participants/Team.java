package sportgames.participants;

public class Team implements IParticipant {

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
