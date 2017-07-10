/**
 * Created by milabobo on 8:42 PM.
 */
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return EnumSingleton.class.getCanonicalName() + "@" + hashCode();
    }
}
