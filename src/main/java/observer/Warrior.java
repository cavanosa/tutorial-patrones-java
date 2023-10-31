package observer;

public class Warrior extends Enemy implements MyObserver {

    public Warrior(String name) {
        super(name);
        setActive(false);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " warrior on attack!!");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName() + " warrior is active");
    }

    @Override
    public void update() {
        activate();
        attack();
    }
}
