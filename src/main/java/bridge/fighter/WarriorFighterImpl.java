package bridge.fighter;

public class WarriorFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("warrior attack!!");
    }

    @Override
    public void protect() {
        System.out.println("warrior protect!!");
    }
}
