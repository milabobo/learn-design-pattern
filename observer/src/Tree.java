import java.util.ArrayList;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Tree implements Observable {
    ArrayList<IObserver> observers = new ArrayList<>();
    int leafCount = 100;

    public Tree(int leafCount) {
        this.leafCount = leafCount;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyDataChange() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }

    int getLeafCount() {
        return leafCount;
    }

    void dropLeaf() {
        leafCount--;
        notifyDataChange();
    }
}
