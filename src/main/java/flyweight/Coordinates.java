package flyweight;

public class Coordinates {
    private int posX, posY, posZ;

    public Coordinates() {
        posX = (int) (Math.random() * 100);
        posY = (int) (Math.random() * 100);
        posZ = (int) (Math.random() * 100);
    }

    public static Coordinates getCoordinates() {
        return new Coordinates();
    }

    @Override
    public String toString() {
        return "posX=" + posX +
                ", posY=" + posY +
                ", posZ=" + posZ;
    }
}
