/**
 * Created by milabobo on 8:42 PM.
 */
public final class LazySingleton {

    private static LazySingleton sInstance;
    private LazySingleton() {}

    public synchronized static LazySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new LazySingleton();
        }

        return sInstance;
    }

}
