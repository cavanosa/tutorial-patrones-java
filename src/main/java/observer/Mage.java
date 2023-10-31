package observer;

public class Mage extends Enemy implements MyObserver {

    public Mage(String name) {
        super(name);
        setActive(false);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " mage on attack!!");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName() + " mage is active");
    }

    @Override
    public void update() {
        activate();
        attack();
    }
}
