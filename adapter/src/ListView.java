/**
 * Created by milabobo on 8:42 PM.
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
