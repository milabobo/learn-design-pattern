import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianu on 7/10/17.
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
