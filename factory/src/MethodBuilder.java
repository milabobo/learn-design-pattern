import java.util.HashMap;
import java.util.Map;

/**
 * Created by milabobo on 8:42 PM.
 */
public class MethodBuilder<Fruit> {
    Map<FruitType, CreateMethod<Fruit>> map;

    public MethodBuilder() {
        this.map = new HashMap<>();
    }

    CreateMethod<Fruit> get(FruitType type) {
        return map.get(type);
    }

    MethodBuilder<Fruit> add(FruitType type, CreateMethod<Fruit> method) {
        map.put(type, method);
        return this;
    }

}
