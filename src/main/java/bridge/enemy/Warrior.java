package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.WarriorFighterImpl;

public class Warrior extends Enemy {

    public Warrior() {
        setFighter(new WarriorFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    public void attack() {
        System.out.println("warrior:");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("warrior:");
        getFighter().protect();
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }
}
