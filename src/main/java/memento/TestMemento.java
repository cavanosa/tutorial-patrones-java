package memento;

public class TestMemento {
    public static void main(String[] args) {
        String name = "game1";
        Game game = new Game(name, 1, 0);
        game.save();
        System.out.println("Save 1: " + game);
        game = new Game(name, 2, 10);
        game.save();
        System.out.println("Save 2: " + game);
        System.out.println("===============");
        game = new Game(name);
        game.back();
        System.out.println("Undo 1: " + game);
        System.out.println("===============");
        game = new Game(name);
        game.forward();
        System.out.println("Redo 1: " + game);
    }
}
