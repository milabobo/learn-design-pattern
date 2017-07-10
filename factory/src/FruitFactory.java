/**
 * Created by milabobo on 8:42 PM.
 */
public class FruitFactory {
    MethodBuilder<Fruit> builder;
    private FruitFactory(MethodBuilder<Fruit> builder) {
        this.builder = builder;
    }

    Fruit create(FruitType type) {
        return builder.get(type).getFruit();
    }

    static FruitFactory factory(MethodBuilder<Fruit> builder) {
        return new FruitFactory(builder);
    }
}
