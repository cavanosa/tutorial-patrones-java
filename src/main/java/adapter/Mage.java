package adapter;

public class Mage implements Enemy{
    @Override
    public void attack() {
        System.out.println("mage attack!!");
    }

    @Override
    public void damage() {
        System.out.println("mage damage!!");
    }
}
