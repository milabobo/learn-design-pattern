/**
 * Created by tianu on 7/10/17.
 */
public class Human implements IObserver {
    Tree tree;

    public Human(Tree tree) {
        this.tree = tree;
    }

    @Override
    public void notifyChanged(Observable observable) {
        System.out.println("Tree's total leaf: " + tree.getLeafCount());
    }
}
