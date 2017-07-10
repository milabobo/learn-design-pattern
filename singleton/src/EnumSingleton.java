/**
 * Created by tianu on 7/10/17.
 */
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return EnumSingleton.class.getCanonicalName() + "@" + hashCode();
    }
}
