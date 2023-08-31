package factory;

public class EnemyFactory {

    public Enemy createEnemy(String type) {
        if(type.equalsIgnoreCase("warrior"))
            return new Warrior();
        else if(type.equalsIgnoreCase("mage"))
            return new Mage();
        else
            return null;
    }
}
