package prototype;

public abstract class Enemy {
    protected int health;
    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Enemy(Enemy enemy) {
        if(enemy != null){
            setHealth(enemy.getHealth());
            setDamage(enemy.getDamage());
        }
    }

    public abstract Enemy clone();

    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getDamage() {
        return damage;
    }

    public Enemy setDamage(int damage) {
        this.damage = damage;
        return this;
    }


}
