package abstractfactory.armor;

public class HeavyArmor implements Armor{

    @Override
    public void protect() {
        System.out.println("heavy armor protect!!");
    }
}
