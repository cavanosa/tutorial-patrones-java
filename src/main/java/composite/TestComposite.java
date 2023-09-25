package composite;

public class TestComposite {
    public static void main(String[] args) {
        BaseItem inventory = new Bag("inventory");
        BaseItem bagCoins = new Bag("bag coins");
        BaseItem bagPotions = new Bag("bag potions");

        BaseItem coins = new Item("coins", 6);
        bagCoins.add(coins);
        BaseItem magicPotion = new Item("Magic potion", 3);
        BaseItem healthPotion = new Item("Health potion", 3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        BaseItem blade = new Item("blade", 3);
        BaseItem shield = new Item("shield", 3);
        BaseItem armor = new Item("armor", 3);

        inventory.add(bagCoins);
        inventory.add(bagPotions);
        inventory.add(blade);
        inventory.add(shield);
        inventory.add(armor);

        System.out.println("Inventory total value: " + inventory.getValue());
    }
}
