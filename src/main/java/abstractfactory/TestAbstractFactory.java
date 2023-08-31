package abstractfactory;

import abstractfactory.armor.Armor;
import abstractfactory.factory.EnemyAbstractFactory;
import abstractfactory.factory.MageFactory;
import abstractfactory.factory.WarriorFactory;
import abstractfactory.weapon.Weapon;
import factorymethod.Enemy;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();
        mage.attack();
        robe.protect();
        wizardStaff.damage();
    }
}
