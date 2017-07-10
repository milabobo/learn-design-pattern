import java.util.ArrayList;

/**
 * Created by tianu on 7/10/17.
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
            observers.get(i).notifyChanged(this);
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
