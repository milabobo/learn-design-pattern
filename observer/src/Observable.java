/**
 * Created by milabobo on 8:42 PM.
 */
public interface Observable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyDataChange();
}
