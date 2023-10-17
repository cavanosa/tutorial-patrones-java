package command;

public class Player {

    private int posX, posY, posZ;

    public Player(int posX, int posY, int posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public void moveFront() {
        posZ++;
        System.out.println("Position Z: " + posZ);
    }

    public void moveBack() {
        posZ--;
        System.out.println("Position Z: " + posZ);
    }

    public void moveRight() {
        posX++;
        System.out.println("Position X: " + posX);
    }

    public void moveLeft() {
        posX--;
        System.out.println("Position X: " + posX);
    }

    public void jump() {
        posY++;
        System.out.println("Position Y:" + posY);
        try {
            Thread.sleep(500);
            posY--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Position Y:" + posY);
    }
}
