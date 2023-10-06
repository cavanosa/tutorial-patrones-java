package flyweight;

import flyweight.assets.Animation;
import flyweight.assets.Prefab;
import flyweight.assets.Sound;
import flyweight.assets.Texture;

import java.util.Arrays;
import java.util.List;

public class TestFlyweight {
    public static void main(String[] args) {
        List<Animation> animations = Arrays.asList(
                new Animation("walk"),
                new Animation("run")
        );
        List<Texture> textures = Arrays.asList(
                new Texture("texture1"),
                new Texture("texture2")
        );
        List<Sound> sounds = Arrays.asList(
                new Sound("bla"),
                new Sound("ble")
        );
        Prefab prefab1 = new Prefab(animations, textures, sounds);
        Npc npc1 = new Npc(prefab1);
        Npc npc2 = new Npc(prefab1);
        System.out.println("=== NPC 1 ==");
        npc1.showNpc();
        System.out.println("=== NPC 2 ==");
        npc2.showNpc();
        List<Animation> animations2 = Arrays.asList(
                new Animation("jump"),
                new Animation("dance")
        );
        List<Texture> textures2 = Arrays.asList(
                new Texture("texture3"),
                new Texture("texture4")
        );
        List<Sound> sounds2 = Arrays.asList(
                new Sound("bli"),
                new Sound("blu")
        );
        Prefab prefab2 = new Prefab(animations2, textures2, sounds2);
        Npc npc3 = new Npc(prefab2);
        System.out.println("=== NPC 3 ==");
        npc3.showNpc();
    }
}
