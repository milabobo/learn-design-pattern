/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(25);
        Human man = new Human(tree);
        tree.addObserver(man);
        tree.dropLeaf();
    }
}
