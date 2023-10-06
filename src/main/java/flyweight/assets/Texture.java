package flyweight.assets;

public class Texture {

    private String texture;

    public Texture(String texture) {
        this.texture = texture;
    }

    @Override
    public String toString() {
        return texture ;
    }
}
