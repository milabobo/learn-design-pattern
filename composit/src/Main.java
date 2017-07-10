/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        ViewGroup group = new ViewGroup(6);
        group.add(view);
        System.out.println(view);
        System.out.println(group.getChildrenCount());
        System.out.println(group.getChildrenAt(6));
    }
}
