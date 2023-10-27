package memento;

public class Game {
    private String name;
    private int level;
    private int kills;
    private static MementoManager manager = new MementoManager();

    public Game() {
    }

    public Game(String name) {
        this.name = name;
    }

    public Game(String name, int level, int kills) {
        this.name = name;
        this.level = level;
        this.kills = kills;
    }

    public void save(){
        manager.save(new Memento(this));
    }

    public void back(){
        Memento memento = manager.undo();
        setLevel(memento.getLevel());
        setKills(memento.getKills());
    }

    public void forward(){
        Memento memento = manager.redo();
        setLevel(memento.getLevel());
        setKills(memento.getKills());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "name=" + name +
                ", level=" + level +
                ", kills=" + kills;
    }
}
