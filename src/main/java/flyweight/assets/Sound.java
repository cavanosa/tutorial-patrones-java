package flyweight.assets;

public class Sound {

    private String sound;

    public Sound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return sound;
    }
}
