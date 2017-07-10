import java.util.ArrayList;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(9);
        ListView listView = new ListView(new List(list));

        System.out.println(listView.size());
        System.out.println(listView.getPosition(1));
    }
}
