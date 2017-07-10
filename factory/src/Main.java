/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        FruitFactory factory = FruitFactory.factory(new MethodBuilder<Fruit>()
            .add(FruitType.APPLE, Apple::new)
            .add(FruitType.BANANA, Banana::new)
            .add(FruitType.PEAR, Pear::new)
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
