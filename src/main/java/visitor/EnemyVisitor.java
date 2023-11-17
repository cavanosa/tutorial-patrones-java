package visitor;

public class EnemyVisitor implements Visitor {

    @Override
    public void visit(Warrior warrior) {
        System.out.println("Visiting warrior");
        warrior.powerAttack();
    }

    @Override
    public void visit(Mage mage) {
        System.out.println("Visiting mage");
        mage.elementaryAttack();
    }

    @Override
    public void visit(Assassin assassin) {
        System.out.println("Visiting assassin");
        assassin.stealthAttack();
    }
}
