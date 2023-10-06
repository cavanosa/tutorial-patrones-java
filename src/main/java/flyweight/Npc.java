package flyweight;

import flyweight.assets.Prefab;

public class Npc {
    private static final int MAX_HEALTH = 100;
    private static int id = 1;
    private String name;
    private int health;
    private Coordinates coordinates;

    private Prefab prefab;


    public Npc(Prefab prefab) {
        this.name = "NPC" + id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.prefab = prefab;
        id++;
    }

    public void showNpc(){
        System.out.println("name: " + name);
        System.out.println("health: " + health);
        System.out.println(coordinates);
        System.out.println("=== Prefab ===");
        System.out.println(prefab);
    }
}
