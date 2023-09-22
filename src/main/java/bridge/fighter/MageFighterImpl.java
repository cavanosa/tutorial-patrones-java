package bridge.fighter;

public class MageFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("mage attack!!");
    }

    @Override
    public void protect() {
        System.out.println("mage protect!!");
    }
}
