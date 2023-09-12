package prototype;

public class Warrior extends Enemy{

    private int endurance;

    public Warrior(int health, int damage, int endurance) {
        super(health, damage);
        this.endurance = endurance;
    }

    public Warrior(Warrior warrior) {
        super(warrior);
        if (warrior != null)
            setEndurance(warrior.getEndurance());
    }

    @Override
    public Enemy clone() {
        return new Warrior(this);
    }

    public int getEndurance() {
        return endurance;
    }

    public Warrior setEndurance(int endurance) {
        this.endurance = endurance;
        return this;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", damage=" + damage +
                ", endurance=" + endurance +
                '}';
    }


}
