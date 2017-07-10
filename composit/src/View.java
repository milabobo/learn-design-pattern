/**
 * Created by tianu on 7/10/17.
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
