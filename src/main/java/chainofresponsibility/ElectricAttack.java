package chainofresponsibility;

public class ElectricAttack extends ElementaryAttack {
    public ElectricAttack() {
    }

    public ElectricAttack(ElementaryAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {
        if(player.getTypePlayer().equals(TypePlayer.MAGE))
            System.out.println("ELECTRIC attack!!");
        else if(hasNext())
            getNext().attack(player);
        else
            System.out.println("No attack was found");
    }
}
