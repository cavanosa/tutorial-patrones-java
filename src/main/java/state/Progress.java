package state;

public class Progress implements MissionState {

    @Override
    public void next(Mission mission) {
        if (Math.random() < 0.5)
            mission.setState(new Completed());
        else
            mission.setState(new Failed());
    }

    @Override
    public String print() {
        return " is in progress";
    }
}
