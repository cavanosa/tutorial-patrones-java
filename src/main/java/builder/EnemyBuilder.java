package builder;

public class EnemyBuilder {
    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public EnemyBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EnemyBuilder type(String type) {
        this.type = type;
        return this;
    }

    public EnemyBuilder health(int health) {
        this.health = health;
        return this;
    }

    public EnemyBuilder damage(int damage) {
        this.damage = damage;
        return this;
    }

    public EnemyBuilder endurance(int endurance) {
        this.endurance = endurance;
        return this;
    }

    public Enemy build(){
        Enemy enemy = new Enemy();
        enemy.setName(getName());
        enemy.setType(getType());
        enemy.setHealth(getHealth());
        enemy.setEndurance(getEndurance());
        enemy.setDamage(getDamage());
        return enemy;
    }
}
