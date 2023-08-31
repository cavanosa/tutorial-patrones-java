package abstractfactory.enemy;

public class Warrior implements Enemy{


    @Override
    public void attack() {
        System.out.println("warrior attack!!");
    }
}
