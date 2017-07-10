/**
 * Created by tianu on 7/10/17.
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
