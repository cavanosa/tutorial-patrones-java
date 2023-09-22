package bridge.enemy;

import bridge.fighter.Fighter;

public abstract class Enemy {

    protected int health;
    protected Fighter fighter;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
}
