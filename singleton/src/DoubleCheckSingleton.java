/**
 * Created by tianu on 7/10/17.
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
