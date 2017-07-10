import java.util.ArrayList;

/**
 * Created by tianu on 7/10/17.
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
