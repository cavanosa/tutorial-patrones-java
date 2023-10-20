package iterator;

public class Item {
    private String name;
    private int price;
    private Item next;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "name=" + name + '\'' +
                ", price=" + price;
    }
}
