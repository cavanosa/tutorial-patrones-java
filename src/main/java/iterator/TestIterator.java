package iterator;

import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
      /*  ListNode<String> listNode = new ListNode<>(new Node<>("hola"));
        listNode.addEnd("qué");
        listNode.addEnd("tal");
        Iterator<Node<String>> iterator = listNode.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        listNode.forEach(System.out::println);*/
        Inventory inventory = new Inventory();
        inventory.addEnd(new Item("sword", 10));
        inventory.addEnd(new Item("shield", 10));
        inventory.addEnd(new Item("armor", 20));
        inventory.addEnd(new Item("helmet", 10));
        ItemIterator iterator = inventory.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("=========================");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
