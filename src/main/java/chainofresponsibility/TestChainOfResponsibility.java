package chainofresponsibility;

public class TestChainOfResponsibility {

    public static void main(String[] args) {
        Player player = new Player(TypePlayer.ASSASSIN);
        Mage mage = new Mage(new FireAttack(new IceAttack(new ElectricAttack())));
        mage.chainAttack(player);
    }
}
