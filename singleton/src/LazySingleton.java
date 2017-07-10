/**
 * Created by tianu on 7/10/17.
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
