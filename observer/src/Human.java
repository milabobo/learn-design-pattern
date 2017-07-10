/**
 * Created by milabobo on 8:42 PM.
 */
public class Human implements IObserver {
    Tree tree;

    public Human(Tree tree) {
        this.tree = tree;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Tree's total leaf: " + tree.getLeafCount());
    }
}
