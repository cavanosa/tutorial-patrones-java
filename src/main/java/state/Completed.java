package state;

public class Completed implements MissionState {

    @Override
    public void next(Mission mission) {
        System.out.println(mission.getName() + " is completed, no next state");
    }

    @Override
    public String print() {
        return " is completed";
    }
}
