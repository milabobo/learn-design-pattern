/**
 * Created by tianu on 7/10/17.
 */
public interface Observable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyDataChange();
}
