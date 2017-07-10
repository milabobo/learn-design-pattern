import java.util.ArrayList;
import java.util.List;

/**
 * Created by milabobo on 8:42 PM.
 */
public class ViewGroup extends View {
    int count;
    List<View> children;
    public ViewGroup(int count) {
        this.count = count;
        this.children = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            children.add(new View());
        }
    }

    void add(View view) {
        count++;
        children.add(view);
    }

    @Override
    int getChildrenCount() {
        return count;
    }

    @Override
    View getChildrenAt(int i) {
        return children.get(i);
    }
}
