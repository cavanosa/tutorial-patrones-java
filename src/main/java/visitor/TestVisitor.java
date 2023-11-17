package visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("last warrior");
        Mage mage = new Mage("last mage");
        Assassin assassin = new Assassin("last assassin");
        EnemyVisitor visitor = new EnemyVisitor();
        visitor.visit(warrior);
        System.out.println("============");
        visitor.visit(mage);
        System.out.println("============");
        visitor.visit(assassin);
    }
}
