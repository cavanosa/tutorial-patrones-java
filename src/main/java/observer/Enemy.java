package observer;

public abstract class Enemy {

    private String name;
    private boolean active;

    public Enemy(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void activate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
