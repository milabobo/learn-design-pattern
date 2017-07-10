/**
 * Created by milabobo on 8:42 PM.
 */
public class View {

    int getChildrenCount() {
        return 0;
    }

    Rect getBound() {
        return new Rect.Builder().build();
    }

    View getChildrenAt(int i) {
        throw new UnsupportedOperationException("View does not have child");
    }

}
