package bridge;

import bridge.enemy.Mage;
import bridge.enemy.Warrior;
import bridge.fighter.MageFighterImpl;
import bridge.fighter.WarriorFighterImpl;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("============ WARRIOR ===========");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MageFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("============ MAGE ===========");
        Mage mage = new Mage();
        mage.attack();
        mage.protect();
        mage.setFighter(new WarriorFighterImpl());
        mage.attack();
        mage.protect();
    }
}
