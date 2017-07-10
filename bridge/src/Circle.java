/**
 * Created by milabobo on 8:42 PM.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void onDraw() {
        System.out.println("Draw circle with color " + color.getColor());
    }
}
