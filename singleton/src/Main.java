/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        System.out.println(singleton);
        System.out.println(EagerSingleton.getInstance());
        System.out.println(lazySingleton);
        System.out.println(LazySingleton.getInstance());
        System.out.println(doubleCheckSingleton);
        System.out.println(DoubleCheckSingleton.getInstance());
        System.out.println(enumSingleton);
        System.out.println(EnumSingleton.INSTANCE);
    }
}
