package flyweight.assets;

import java.util.HashMap;
import java.util.Map;

public class AssetsPrefab {

    private static Map<Integer, Prefab> prefabs = new HashMap<>();

    public static Prefab getPrefab(Prefab prefab) {
        int id = prefab.getId();
        if(!prefabs.containsKey(id))
            prefabs.put(id, prefab);
        return prefabs.get(id);
    }
}
