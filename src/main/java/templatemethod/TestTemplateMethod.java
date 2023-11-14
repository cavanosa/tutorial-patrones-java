package templatemethod;

public class TestTemplateMethod {
    public static void main(String[] args) {
       EnemyTemplate warrior = new Warrior();
       EnemyTemplate mage = new Mage();
       warrior.template();
       mage.template();
    }
}
