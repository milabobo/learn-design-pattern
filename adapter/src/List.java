import java.util.ArrayList;

/**
 * Created by tianu on 7/10/17.
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
