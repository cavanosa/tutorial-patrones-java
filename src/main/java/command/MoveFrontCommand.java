package command;

public class MoveFrontCommand implements Command {

    private Player player;

    public MoveFrontCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveFront();
    }
}
