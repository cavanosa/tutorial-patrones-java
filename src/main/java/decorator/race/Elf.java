package decorator.race;

import decorator.Enemy;

public class Elf implements Enemy {
    @Override
    public void attack() {
        System.out.println("Elf attack!!");
    }
}
