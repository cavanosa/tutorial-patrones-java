package composite;

import java.util.ArrayList;

public class Bag extends BaseItem{

    public Bag(String name) {
        super(name, 0);
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    @Override
    public void delete(BaseItem baseItem) {
        items.remove(baseItem);
    }

    @Override
    public int getValue() {
        int result = value;
        for (BaseItem item: items)
            result += item.getValue();
        return result;
    }
}
