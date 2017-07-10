import java.util.ArrayList;

/**
 * Created by milabobo on 8:42 PM.
 */
public class List implements IDataAdapter {
    ArrayList<Integer> list;

    public List(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public int getPosition(int i) {
        return list.get(i);
    }
}
