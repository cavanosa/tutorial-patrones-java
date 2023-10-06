package flyweight;

import flyweight.assets.AssetsPrefab;
import flyweight.assets.Prefab;

public class NpcFactory {
    public static Npc createNpc(Prefab prefab) {
        Prefab prefabNew = AssetsPrefab.getPrefab(prefab);
        Npc npc = new Npc(prefabNew);
        return npc;
    }
}
