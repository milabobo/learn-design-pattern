/**
 * Created by tianu on 7/10/17.
 */
public class ListView {
    IDataAdapter adapter;

    public ListView(IDataAdapter adapter) {
        this.adapter = adapter;
    }

    int size() {
        return adapter.getCount();
    }

    int getPosition(int i) {
        return adapter.getPosition(i);
    }

}
