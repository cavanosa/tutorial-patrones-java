package decorator.decorator;

import decorator.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator{

    public WarriorEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Warrior attack!!");
    }
}
