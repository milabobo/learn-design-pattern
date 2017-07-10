/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        FruitFactory factory = FruitFactory.factory(new MethodBuilder<Fruit>()
            .add(FruitType.APPLE, new CreateMethod<Fruit>() {
                @Override
                public Fruit getFruit() {
                    return new Apple();
                }
            })
            .add(FruitType.BANANA, new CreateMethod<Fruit>() {
                @Override
                public Fruit getFruit() {
                    return new Banana();
                }
            })
            .add(FruitType.PEAR, new CreateMethod<Fruit>() {
                @Override
                public Fruit getFruit() {
                    return new Pear();
                }
            })
        );

        System.out.println(factory.create(FruitType.APPLE));
        System.out.println(factory.create(FruitType.BANANA));
        System.out.println(factory.create(FruitType.PEAR));
        System.out.println();
        System.out.println(factory.create(FruitType.APPLE));
        System.out.println(factory.create(FruitType.BANANA));
        System.out.println(factory.create(FruitType.PEAR));
    }
}
