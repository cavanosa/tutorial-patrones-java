package state;

public class Mission {
    private String name;
    private MissionState state;

    public Mission(String name) {
        this.name = name;
        state = new Blocked();
    }

    public void next(){
        state.next(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionState getState() {
        return state;
    }

    public void setState(MissionState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return getName() + state.print();
    }
}
