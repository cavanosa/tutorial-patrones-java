package command;

public class MoveBackCommand implements Command {

    private Player player;

    public MoveBackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveBack();
    }
}
