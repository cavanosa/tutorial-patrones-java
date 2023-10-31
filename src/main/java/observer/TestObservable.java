package observer;

public class TestObservable {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("warrior 1");
        Warrior warrior2 = new Warrior("warrior 2");
        Mage mage1 = new Mage("mage 1");
        Mage mage2 = new Mage("mage 2");
        Vigilant vigilant = new Vigilant("vigilant");
        vigilant.subscribe(warrior1);
        vigilant.subscribe(warrior2);
        vigilant.subscribe(mage1);
        vigilant.subscribe(mage2);
        vigilant.activate();
        System.out.println("==============");
        vigilant.unsubscribe(mage2);
        vigilant.activate();
    }
}
