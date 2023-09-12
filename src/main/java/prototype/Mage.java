package prototype;

public class Mage extends Enemy{

    private int mana;

    public int getMana() {
        return mana;
    }

    public Mage(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    public Mage(Mage mage) {
        super(mage);
        if(mage != null)
            setMana(mage.getMana());
    }

    @Override
    public Enemy clone() {
        return new Mage(this);
    }

    public Mage setMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "health=" + health +
                ", damage=" + damage +
                ", mana=" + mana +
                '}';
    }


}
