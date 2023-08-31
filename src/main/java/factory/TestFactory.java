package factory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.createEnemy("warrior");
        Enemy mage = enemyFactory.createEnemy("mage");
        warrior.attack();
        mage.attack();
    }
}
