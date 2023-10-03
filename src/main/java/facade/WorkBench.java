package facade;

public class WorkBench implements Smithy{

    public static final String ACTION = "improve";

    @Override
    public void work(String name) {
        System.out.println("let's " + ACTION + " the " + name + "...");
    }

    @Override
    public boolean search(String name) {
        return Inventory.search(name, false);
    }

    @Override
    public void remove(String name) {
        Inventory.remove(name, false);
    }

    @Override
    public void working(String name) {
        System.out.println("improving " + name);
    }
}
