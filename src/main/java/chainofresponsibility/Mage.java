package chainofresponsibility;

import java.util.Locale;

public class Mage {

    private ElementaryAttack elementaryAttack;

    public Mage(ElementaryAttack elementaryAttack) {
        this.elementaryAttack = elementaryAttack;
    }

    public ElementaryAttack getElementaryAttack() {
        return elementaryAttack;
    }

    public void setElementaryAttack(ElementaryAttack elementaryAttack) {
        this.elementaryAttack = elementaryAttack;
    }

    public void chainAttack(Player player) {
        System.out.println("Attack to " + player.getTypePlayer().name().toLowerCase());
        elementaryAttack.attack(player);
    }
}
