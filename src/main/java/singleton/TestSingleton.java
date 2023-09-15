package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread threadPepe = new Thread(new RunPepe());
        Thread threadManolo = new Thread(new RunManolo());

        threadPepe.start();
        threadManolo.start();
    }

    static class RunPepe implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("pepe");
            System.out.println("Running pepe: " + player);
        }
    }

    static class RunManolo implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("manolo");
            System.out.println("Running manolo: " + player);
        }
    }
}
