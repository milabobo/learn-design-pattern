/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(25);
        Human man = new Human(tree);
        tree.addObserver(man);
        tree.dropLeaf();
    }
}
