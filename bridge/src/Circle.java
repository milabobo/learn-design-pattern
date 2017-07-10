/**
 * Created by tianu on 7/10/17.
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
