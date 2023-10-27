package memento;

public class Memento {
    private int level;
    private int kills;

    public Memento(Game game) {
        level = game.getLevel();
        kills = game.getKills();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}
