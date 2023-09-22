package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.MageFighterImpl;

public class Mage extends Enemy {
    public Mage() {
        setFighter(new MageFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }

    public void attack() {
        System.out.println("mage:");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("mage:");
        getFighter().protect();
    }
}
