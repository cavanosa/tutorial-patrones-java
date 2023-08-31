package abstractfactory.factory;

import abstractfactory.armor.Armor;
import abstractfactory.armor.Robe;
import abstractfactory.weapon.Weapon;
import abstractfactory.weapon.WizardStaff;
import factorymethod.Enemy;
import factorymethod.Mage;

public class MageFactory extends EnemyAbstractFactory{

    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
