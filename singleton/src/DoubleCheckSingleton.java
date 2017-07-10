/**
 * Created by milabobo on 8:42 PM.
 */
public final class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton sInstance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (sInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DoubleCheckSingleton();
                }
                return sInstance;
            }
        }
        return sInstance;
    }

}
