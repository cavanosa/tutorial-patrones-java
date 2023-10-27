package mediator;

public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Enemy enemy1 = new Enemy("enemy1", mediator);
        Enemy enemy2 = new Enemy("enemy2", mediator);
        Enemy enemy3 = new Enemy("enemy3", mediator);
        Companion companion = new Companion("companion1", mediator);
        enemy1.send();
    }
}
