/**
 * Created by milabobo on 8:42 PM.
 */
public class Rect extends Shape {
    public Rect(Color color) {
        super(color);
    }

    @Override
    public void onDraw() {
        System.out.println("Draw rect with color " + color.getColor());
    }
}
