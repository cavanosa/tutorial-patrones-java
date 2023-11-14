package templatemethod;

public class Warrior extends EnemyTemplate {
    @Override
    public void setSkills() {
        System.out.println("Health: 150, Mana: 0, Stamina: 150");
    }

    @Override
    public void attack() {
        System.out.println("Warrior attack");
    }

    @Override
    public void protect() {
        System.out.println("Warrior protect");
    }

    @Override
    public void result() {
        System.out.println("Warrior has survived");
    }
}
