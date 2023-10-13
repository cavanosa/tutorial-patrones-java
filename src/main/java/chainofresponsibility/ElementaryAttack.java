package chainofresponsibility;

public abstract class ElementaryAttack {

    protected ElementaryAttack next;

    public ElementaryAttack() {
    }

    public ElementaryAttack(ElementaryAttack next) {
        this.next = next;
    }

    public ElementaryAttack getNext() {
        return next;
    }

    public void setNext(ElementaryAttack next) {
        this.next = next;
    }

    public boolean hasNext() {
        return getNext() != null;
    }

    public abstract void attack(Player player);
}
